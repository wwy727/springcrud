package com.example.restapi;



import java.util.ArrayList;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.restapi.Service.UserService;
import com.example.restapi.domain.Role;
import com.example.restapi.domain.User;






@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
			
			userService.saveUser(new User(null, "Lebron Travolta", "lebron", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "John Smith", "jhon", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jerry Carry", "jerry", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Aaron Schwar", "aaron", "1234", new ArrayList<>()));
			
			userService.addRoleToUser("lebron", "ROLE_USER");
			userService.addRoleToUser("lebron", "ROLE_MANAGER");
			userService.addRoleToUser("jhon", "ROLE_MANAGER");
			userService.addRoleToUser("jerry", "ROLE_ADMIN");
			userService.addRoleToUser("aaron", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("aaron", "ROLE_ADMIN");
			userService.addRoleToUser("aaron", "ROLE_USER");
		};
	}
	

}
