package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Developer hong = factory.getBean("honggd",Developer.class);
		Engineer lee = factory.getBean("leess",Engineer.class);
		
		System.out.println(hong);
		System.out.println(lee);
	
		((ClassPathXmlApplicationContext)factory).close();
	}

}
