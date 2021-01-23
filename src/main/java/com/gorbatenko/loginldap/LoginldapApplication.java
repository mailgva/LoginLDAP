package com.gorbatenko.loginldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoginldapApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginldapApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
}
