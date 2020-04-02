package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
			
		address my = (address) factory.getBean("my");
		address friend01 = (address) factory.getBean("friend01");
		address friend02 = (address) factory.getBean("friend02");
		
		System.out.println(my);
		System.out.println(friend01);
		System.out.println(friend02);
	}
}
