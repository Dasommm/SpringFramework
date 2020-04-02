package com.hello.mvc.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mvc.model.dao.HelloDao;

@Service
public class HelloBiz {
	
	//TODO : 06. Dao(@repository) 호출
	@Autowired
	private HelloDao dao;

	public String getHello() {
		//TODO : 08. biz에서 리턴
		return "Hello, " + dao.getHello();
	}
	
}
