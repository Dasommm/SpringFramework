package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Address lee = (Address) factory.getBean("lee");
		Address hong = factory.getBean("hong", Address.class);	// 이렇게 형변환 해도 된다.
		
		System.out.println(lee);
		System.out.println(hong);
		
		((ClassPathXmlApplicationContext)factory).close();		//닫아준다
		
	}
	
}
