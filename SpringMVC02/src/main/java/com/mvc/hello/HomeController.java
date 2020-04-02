package com.mvc.hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.hello.dto.AddressDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/command.do", method = RequestMethod.GET)
	public String getCommand(Model model, @RequestParam("name") String name, String addr, String phone) {	// 키 값과 넘어오는 값의 이름이 같으면 requestparam 생략가능 
		model.addAttribute("dto", new AddressDto(name, addr, phone));
		
		return "getcommand";	//servlet-context의 resolver에게 리턴한다.
	}
	@RequestMapping(value = "/command.do",method = RequestMethod.POST)
	public String postCommand(Model model, @ModelAttribute AddressDto dto) {	//ModelAttribute : 각 setter를 찾아서 자동으로 값을 넣어준다
		
		model.addAttribute("dto", dto);
		
		return "postcommand";
	}
	
	@RequestMapping(value = "/void.do")	//void인 경우 .do를 제외한 'void.jsp'를 찾는다
	public void voidPage(Model model) {
		model.addAttribute("msg", "void page");
	}
}
