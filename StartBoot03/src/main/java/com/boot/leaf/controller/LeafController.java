package com.boot.leaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.leaf.dto.LeafDto;

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
	
	@GetMapping("/expr")
	public String expresstion(Model model) {
		
		model.addAttribute("name", "thymeleaf");
		LeafDto dto = new LeafDto("java",1);
		model.addAttribute("dto", dto);
		
		List<LeafDto> list = new ArrayList<LeafDto>();
		list.add(new LeafDto("Database",2));
		list.add(new LeafDto("HTML/CSS",3));
		list.add(new LeafDto("JS/JQ",4));
		
		model.addAttribute("list", list);
		
		return "expression";
	}
	
	@GetMapping("/params")
	public String parameter(Model model, HttpSession session) {
		model.addAttribute("dto", new LeafDto("Jsp/Servlet",5));
		session.setAttribute("pw", "session val");
		
		return "params";
	}
	
	
}
