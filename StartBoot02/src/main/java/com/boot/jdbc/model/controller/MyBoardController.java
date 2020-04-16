package com.boot.jdbc.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBiz;
import com.boot.jdbc.model.dto.MyDto;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {
	
	@Autowired
	private MyBiz myBiz;
	
	//get방식으로 넘어오는 'list' url을 연결해주자
	@GetMapping("/list")
	public String selectList(Model model) {	//view의 값을 전달하는 객체
		//파라미터에서 선언한 객체에, 'list'라는 이름으로 myBiz.selectList()를 담자
		
		model.addAttribute("list", myBiz.selectList());
		
		return "myboardlist";
	}
	
	@RequestMapping("/insertform")
	public String insertform() {
		return "myboardinsertform";
	}
	
	@PostMapping("/insert")
	public String insert(MyDto dto) {
		
		int res = myBiz.insert(dto);
		if(res>0) {
			return "redirect:list";
		}else {
			return "myboardinsertform";			
		}
	}
	
	@RequestMapping("/detail")
	public String detail(Model model, int myno) {
		
		MyDto dto = myBiz.selectOne(myno);
		model.addAttribute("dto", dto);
		
		return "myboarddetail";
	}
	
	@RequestMapping("/delete")
	public String delete(int myno) {
		
		int res = myBiz.delete(myno);
		if(res>0) {
			return "redirect:list";
		}else {
			return "rediect:detail?myno="+myno;
			
		}
		
	}
	
	@RequestMapping("/updateform")
	public String updateform(Model model, int myno) {
		
		MyDto dto = myBiz.selectOne(myno);
		model.addAttribute("dto", dto);
		
		return "myboardupdateform";
	}
	
	@PostMapping("/update")
	public String update(MyDto dto) {
		int res = myBiz.update(dto);
		
		if(res>0) {
			return "redirect:detail?myno="+dto.getMyno();
		}else {
			return "redirect:updateform?myno="+dto.getMyno();			
		}
		
	}
	

}
