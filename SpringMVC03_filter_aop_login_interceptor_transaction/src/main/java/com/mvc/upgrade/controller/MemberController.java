package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {

	// class clazz
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz biz;
	
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "mvclogin";
	}
	
	@RequestMapping(value="/ajaxlogin.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(HttpSession session, @RequestBody MemberDto dto){
		
		logger.info("AJAX LOGIN");
		/*
		 * @ResponseBody : java 객체를 response 객체에 binding
		 * @RequestBody : request 객체에 담겨져 넘어오는 데이터를 java 객체에 binding
		 *  
		 */
		
		MemberDto res = biz.login(dto);
		boolean check = false;
		
		if(res != null) {
			session.setAttribute("login", res);
			check = true;
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		
		return map;
	}
	
	@RequestMapping("/joinform.do")
	public String joinform() {
		logger.info("JOIN FORM");
		return "mvcjoin";
	}
	
	@RequestMapping("/joinres.do")
	public String insert(Model model, MemberDto dto) {
		logger.info("MEMBER INSERT");
		
		int res = biz.insert(dto);
		
		if(res > 0) {
			System.out.println("가입성공");
		} else {
			System.out.println("가입실패");
		}
		
		return "redirect:loginform.do";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
