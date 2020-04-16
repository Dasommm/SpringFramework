package com.boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class StartBoot04Application {

	public static void main(String[] args) {
		SpringApplication.run(StartBoot04Application.class, args);
	}
	
	@GetMapping("/")
	public String root() {
		return "index";
	}

}
