package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		Person w = (Person) factory.getBean("woman");
		Person m = (Person) factory.getBean("man");
		
		System.out.println("lady");
		w.classWork();
		System.out.println("------");
		System.out.println("man");
		m.classWork();
	}

}
