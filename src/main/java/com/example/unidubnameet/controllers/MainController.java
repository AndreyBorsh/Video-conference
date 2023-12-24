package com.example.unidubnameet.controllers;

import com.example.unidubnameet.models.Users;
import com.example.unidubnameet.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class MainController {
    @GetMapping("/register") // для всех пользователей
    public String register(Model model) {
        model.addAttribute("title", "Страница регистрации");
        return "register";
    }
    @GetMapping("/login") // для всех пользователей
    public String login(Model model) {
        model.addAttribute("title", "Страница входа");
        return "login";
    }
    @GetMapping("/main") // для зарегистрированных и авторизованных пользователей
    public String mainPage(Model model) {
        model.addAttribute("title", "MeetUni-Dubna");
        return "main";
    }

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/")
    public String main(Model model) {
        Iterable<Users> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "mainTemp";
    }
    @GetMapping("/room")
    public String room(Model model) {
        return "room";
    }

    @PostMapping("/register")
    public String registerUserAdd(@RequestParam String email, @RequestParam String firstName,
                                  @RequestParam String lastName, @RequestParam String password, Model model) {
        //BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        //String hashedPassword = encoder.encode(password);

        //Users user = new Users(email, firstName, lastName, hashedPassword);
        //usersRepository.save(user);
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password) {
        Iterable<Users> users = usersRepository.findAll();

        return "redirect:/main";
    }
}