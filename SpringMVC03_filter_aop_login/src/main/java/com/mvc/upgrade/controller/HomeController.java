package com.mvc.upgrade.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.executor.ReuseExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.biz.BoardBizImpl;
import com.mvc.upgrade.model.dto.BoardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardBiz biz = new BoardBizImpl();
	//private BoardBiz biz;로 선언해도 된다. 

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String selectList(Model model){	//jsp까지 값을 전달해줄 Model을 받는다.
		logger.info("SELECT LIST");
		System.out.println("컨트롤러들어왓다");
		List<BoardDto> list = new ArrayList<BoardDto>(); 
		
		list = biz.selectList();	//biz에서 값 데려오기
		System.out.println(list.get(0).getMyname());
		model.addAttribute("list", list);	//가져온 list를 Model에 담는다.
		//model.addAttribute("list", biz.selectList());로 해도 된다.
		
		return "boardList";
	}
	
	@RequestMapping(value = "/insert.do")
	public String insert() {
		return "boardInsert";
	}
	
	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public String insertRes(String name, String title, String content) {
		
		BoardDto insertDto = new BoardDto();
		insertDto.setMyname(name);
		insertDto.setMytitle(title);
		insertDto.setMycontent(content);
		
		int insertRes = biz.insert(insertDto);
		if(insertRes>0) {
			return "redirect:list.do";
		}else {
			return "redirect:insert.do";
		}
		
	}
	
	
	@RequestMapping(value = "/selectOne.do")
	public String selectOne(Model model, @RequestParam int myno) {
		
		System.out.println("detail 컨트롤러");
		model.addAttribute("boardDetail", biz.selectOne(myno));
		
		return "boardDetail";
	}
	
	@RequestMapping(value = "/updateform.do")
	public String update(Model model, @RequestParam int myno) {
		logger.info("UPDATE FORM");
		System.out.println("컨트롤러 업뎃폼 들어옴");
		
		BoardDto dto = biz.selectOne(myno);
		model.addAttribute("dto", dto);
		
		return "boardUpdateForm";
	}
	
	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateRes(BoardDto dto) {
		logger.info("UPDATE RESULT");
		
		int res = biz.update(dto);
		System.out.println("업데이트 res:"+res);
		if(res>0) {
			return "redirect:selectOne.do?myno="+dto.getMyno();
		}else {
			return "redirect:updateform.do?myno="+dto.getMyno();
		}
		
	}
	
	@RequestMapping(value = "/boardDelete.do")
	public String delete(int myno) {
		logger.info("DELETE");
		
		int res = biz.delete(myno);
		System.out.println("delete :"+res);
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:selectOne.do?myno="+myno;			
		}
		
	}
	
}
