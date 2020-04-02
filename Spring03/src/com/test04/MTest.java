package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Developer hong = factory.getBean("honggd",Developer.class);
		Engineer lee = factory.getBean("leess",Engineer.class);
		//여기에서 Developer 와 Engineer로 부르는 이유는 상속을 받지 않았기 때문엔
		
		System.out.println(hong);
		System.out.println(lee);
	}

}
