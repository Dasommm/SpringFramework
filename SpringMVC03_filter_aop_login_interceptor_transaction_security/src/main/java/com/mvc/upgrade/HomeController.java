package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;


@Controller
public class HomeController {
	
	@Autowired
	private BoardBiz biz;
	
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
	
	@RequestMapping("/list.do")
	public String selectlist(Model model) {
		
		logger.info("SELECT LIST");
		model.addAttribute("list", biz.selectList());
		
		return "mvclist";
	}

//글 보기	
	@RequestMapping("/detail.do")
	public String selectone(Model model, int myno) {
		
		logger.info("SELECT ONE");
		model.addAttribute("dto", biz.selectOne(myno) );
		
		return "mvcdetail";
	}

//글 작성	
	@RequestMapping("/insertform.do")
	public String insertForm(Model model) {
		
		return "insertform";
	}
	
	@RequestMapping(value="/insertres.do", method=RequestMethod.POST)
	public String insertRes(Model model, BoardDto dto) {
		
		logger.info("INSERT RESULT");
		
		int res = biz.insert(dto);
		
		if(res>0) {
			return "redirect:list.do";
		} else {
			return "redirect:insertform.do";
		}
		
		
	}
	
// 글 수정	
	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {
		
		logger.info("UPDATE FORM");
		
		BoardDto dto = biz.selectOne(myno);
		model.addAttribute("dto", dto);

		return "mvcupdate";
	}
	
	@RequestMapping(value="/updateres.do", method=RequestMethod.POST)
	public String updateRes(BoardDto dto) {
		
		logger.info("UPDATE RESULT");
		
		int res=biz.update(dto);
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		
		} else {
			return "redirect:updateform.do?myno="+dto.getMyno();
			
		}
		
		
	}

// 글 삭제
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		
		logger.info("DELETE");
		
		int res = biz.delete(myno);
		
		if(res>0) {
			return "redirect:list.do";
		} else {
			return "redirect:list.do";
		}
		
	}
	
	@RequestMapping("/test.do")
	public String test() {
		
		logger.info("TRANSACTION");
		biz.test();
		
		return "redirect:list.do";
	}
	
	
}
