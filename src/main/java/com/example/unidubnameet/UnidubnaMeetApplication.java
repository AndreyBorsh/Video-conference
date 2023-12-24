package com.example.unidubnameet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class UnidubnaMeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnidubnaMeetApplication.class, args);
	}

}
