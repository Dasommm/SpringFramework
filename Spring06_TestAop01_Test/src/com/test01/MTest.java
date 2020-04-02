package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/aopAppcontext.xml");
		
		Human person01 = factory.getBean("person1",Human.class);
		person01.sayName("뽀로로"); 	//joinpoint
		person01.sayJob("개발자");	//joinpoint
		//System.out.println(person01.sayName("뽀로로"));
		//System.out.println(person01.sayJob("개발자"));
		
		System.out.println("------");
		
		Human person02 = factory.getBean("person2",Human.class);
		//System.out.println(person01.sayName("둘리"));
		//System.out.println(person01.sayJob("개그맨"));

	}
}
