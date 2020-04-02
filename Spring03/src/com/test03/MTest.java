package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Developer hong = factory.getBean("hong",Developer.class);
		Engineer lee = factory.getBean("lee",Engineer.class);
		
		//Emp hong = ...
		//Emp lee = .. 로 해도 된다. 보통 부모 클래스꺼를  사용을 한다.
		
		System.out.println(hong);
		System.out.println(lee);
	}

}
