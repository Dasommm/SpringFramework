package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Person w = (Person )factory.getBean("woman");
		Person m = (Person) factory.getBean("man");
	
		System.out.println("여");
		w.classWork();
		System.out.println("-------");
		System.out.println("남");
		m.classWork();
	
	
	}
	
	
}
