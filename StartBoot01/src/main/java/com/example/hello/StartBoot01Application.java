package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class StartBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(StartBoot01Application.class, args);
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
}
