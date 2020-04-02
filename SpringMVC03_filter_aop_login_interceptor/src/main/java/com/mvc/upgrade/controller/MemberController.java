package com.mvc.upgrade.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

	//class clazz
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz biz;
	
	@RequestMapping(value = "loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		
		return "mvclogin";
	}
	
	@RequestMapping(value = "/ajaxlogin.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(HttpSession session, @RequestBody MemberDto dto){
		//@ResponseBody : java 객체를 response 객체에 binding해준다. 리턴값이 View Resolver 거치지 않고 바로 ajax로 보내진다.
			//dependency에서 추가한 Jackson이 Map 객체를 JSON으로 바꿔준다.
		//@requestBody : request 객체에 담겨져 넘어오는 데이터를 java 객체에 binding 해준다. 
		logger.info("LOGIN");
		MemberDto res = biz.login(dto);
		boolean check = false;
		if(res != null) {
			session.setAttribute("login", res);
			check = true;
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check",check);
		
		return map;
	}
	
	@RequestMapping(value = "/joinform.do")
	public String joinForm() {
		logger.info("JOIN FORM");
		return "memberJoin";
	}
	
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String join(Model model, MemberDto dto) {
		logger.info("JOIN");
		
		int joinRes = biz.join(dto);
		if(joinRes>0) {
			logger.info("회원가입 성공");
			model.addAttribute("joinres", "success");
			return "alert";
		}else {
			logger.info("회원가입 실패");
			model.addAttribute("joinres", "fail");
			return "alert";
		}		
		
	}


}
