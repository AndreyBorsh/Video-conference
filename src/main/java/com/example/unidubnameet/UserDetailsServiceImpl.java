//package com.example.unidubnameet;
//
//import com.example.unidubnameet.models.Users;
//import com.example.unidubnameet.repo.UsersRepository;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//    private final UsersRepository usersRepository;
//
//    public UserDetailsServiceImpl(UsersRepository usersRepository) {
//        this.usersRepository = usersRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Users user = usersRepository.findByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException("Пользователь с почтой " + email + " не найден"));
//
//        return User.builder()
//                .username(user.getEmail())
//                .password(user.getPassword())
//                .roles("USER")
//                .build();
//    }
//}
