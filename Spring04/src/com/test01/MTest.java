package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MyClass myClass = factory.getBean("myClass",MyClass.class);
		BeanTest beans = (BeanTest)factory.getBean("beanTest");
		
	}

}
