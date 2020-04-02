package com.test02;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		MemberInfo member = (MemberInfo) factory.getBean("member");
		int num = (int)(Math.random()*2);
		if(num == 0) {
			String msg = factory.getMessage("title",null,"기본메세지", Locale.getDefault());
			System.out.println(msg);
			member.display(Locale.getDefault());
		}else {
			String msg = factory.getMessage("title", null, "default message", Locale.ENGLISH);
			System.out.println(msg);
			member.display(Locale.ENGLISH);
		}
	}
	
}
