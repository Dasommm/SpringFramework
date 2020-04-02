package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc.biz.HelloBiz;

@Controller
public class HelloController {

	//TODO : 05.Biz(@Serviec) 호출
	@Autowired
	private HelloBiz biz;
	
	//TODO : 04.Handler Mapping(/hello.do)을 통해 controller의 메서드를 찾아옴
	@RequestMapping("/hello.do")
	public ModelAndView getHello() {
		
		ModelAndView mav = new ModelAndView();
		
		String msg = biz.getHello();
		
		//TODO: 09. 리턴받은 값을 ModelAndView 객체에 담아서 전달
		mav.addObject("message", msg);
		mav.setViewName("/WEB-INF/views/Hello.jsp");	//응답할 view의 이름 (경로)
		
		return mav;
	}
	
	@RequestMapping("/bye.do")
	public String getBye(String name, Model model) {	//쿼리스트링에 name=..으로 한 경우 이름을 같게하면 request param 할 필요 없다.
		
		model.addAttribute("message", name);	
		
		return"/WEB-INF/views/bye.jsp";
	}
	
}

/*
 * @requestMapping
 * -url 을 class 또는 method와 mapping시켜주는 역할
 * 
 * @requestParam
 * - key=value 형태로 넘어오는 파라미터(쿼리스트링)를 mapping된 method의 파라미터로 지정
 * 
 * @modelAttribure
 * - form tag를 통해 넘어온 model을 mapping된 method의 파라미터로 지정(주로 POST방식)
 * 
 * @sessionAttribute
 * -session에서 model의 정보를 유지하고 싶을 경우 사용
 * 
 * 
 */
