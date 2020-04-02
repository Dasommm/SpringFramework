package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		//banana bean을 사용해서 sayHello호출하자
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MessageBean bean = (MessageBean) factory.getBean("banana");
		bean.sayHello();
		
		MessageBean mango = (MessageBean) factory.getBean("mango");
		mango.sayHello();
		
		//bean = (MessageBean) factory.getBean("mango");
		//bean.sayHello();
		
		MessageBean grape = (MessageBean) factory.getBean("grape");
		grape.sayHello();
	}

}
