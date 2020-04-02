package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Person w = factory.getBean("woman",Person.class);
		Person m = factory.getBean("man",Person.class);
		
		System.out.println("여학생입장");
		w.classWork();
		System.out.println("-------------");
		System.out.println("남학생입장");
		m.classWork();
		
		// JoinPoint : target을 호출하는 시점
		// 원래 target은 컴킨다. 집에 간다
		// 중간에 proxy 객체를 만들어서 target인 척 가로챈다(intercept)
		// myAspect에 taget 앞뒤로 컴 킨다. 집에간다 가 있다. 
		// joinPoint와 proxy와 연결하는게 pointcut
		
	}
}
