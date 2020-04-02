package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp my = (Emp)factory.getBean("my");
		Emp sun = factory.getBean("friend01",Emp.class);
		Emp moon = factory.getBean("friend02",Emp.class);
		
		System.out.println(my);
		System.out.println(sun);
		System.out.println(moon);
	}
}
