package com.example.unidubnameet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class UnidubnaMeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnidubnaMeetApplication.class, args);

//		String url = "jdbc:mysql://localhost:3306/meetunidubna?serverTimezone=Europe/Minsk&useSSL=false";
//		String username = "root";
//		String password = "123456";
//		System.out.println("Connecting...");
//		try (Connection connection = DriverManager.getConnection(url, username, password)) {
//			System.out.println("Connection successful!");
//		} catch (SQLException e) {
//			System.out.println("Connection failed!");
//			e.printStackTrace();
//		}
	}

}
