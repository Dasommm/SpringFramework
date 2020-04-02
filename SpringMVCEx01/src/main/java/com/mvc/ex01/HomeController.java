package com.mvc.ex01;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.ex01.model.biz.ExboardBiz;
import com.mvc.ex01.model.dto.ExboardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ExboardBiz biz;
	
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

	@RequestMapping(value = "/list.do")
	public String selectAll(Model model) {
		logger.info("ALL List");
		
		List<ExboardDto> list = new ArrayList<ExboardDto>();
		list = biz.selectAll();
		model.addAttribute("list", list);
		System.out.println("컨트롤러"+list.get(0).getExtitle());
		
		return "boardList";
	}
	
	@RequestMapping(value = "/boardInsertForm.do")
	public String insertForm() {
		logger.info("insert form");
		return "boardInsert";
	}
	
	@RequestMapping(value = "/boardInsert.do", method = RequestMethod.POST)
	public String insert(Model model, ExboardDto dto) {
		logger.info("Insert");
		
		int res = biz.boardInsert(dto);
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:boardInsert.do";			
		}
		
	}
	
	@RequestMapping(value = "/boardDetail.do")
	public String detail(Model model, int exno) {
		logger.info("Detail");
		
		ExboardDto dto = biz.selectOne(exno);
		model.addAttribute("detailDto", dto);
		
		return "boardDetail";
		
	}
	
	@RequestMapping(value = "/updateForm.do")
	public String updateForm (Model model, int exno) {
		logger.info("Update Form");
		
		ExboardDto updateformDto = biz.selectOne(exno);
		model.addAttribute("updateformDto", updateformDto);
		
		return "boardUpdateForm";	
	}
	
	@RequestMapping(value = "/boardUpdate.do", method = RequestMethod.POST)
	public String update(ExboardDto dto) {
		logger.info("Update");
		
		int res = biz.boardUpdate(dto);
		
		if(res>0) {
			return "redirect:boardDetail.do?exno="+dto.getExno();
		}else {
			return "redirect:updateForm.do?exno="+dto.getExno();
		}
		
	}
	
	@RequestMapping(value ="/delete.do" )
	public String delete(int exno) {
		logger.info("delete");
		
		int res = biz.boardDelete(exno);
		
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:boardDetail.do?exno="+exno;			
		}
	}
	
}
