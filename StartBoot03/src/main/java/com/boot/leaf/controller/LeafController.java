package com.boot.leaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeafController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "Thymeleaf");
		return "hello";
	}
	@GetMapping("/util")
	public String utility() {
		return "utility";
	}
}
