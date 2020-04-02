package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Person w = factory.getBean("woman",Person.class);
		Person m = factory.getBean("man",Person.class);
		
		System.out.println("woman");
		w.classWork();
		System.out.println("------");
		System.out.println("man");
		m.classWork();
		
		//해당 joinPoint(advice가 연결될 수 있는 모든 위치)들에 어떤 advice(CCC의 실제코드들)가 어디에 붙을지 알려주는게 pointCut
		//before 출석카드 [advice] after는 집
		// advice가 어떤 joinPoint와 어떤 advice를 연결해줄지 알려주는 것이 pointCut 
		// pointCut과 advice를 합친게 - advisor 또는 Aspect로 부른다- target에 before와 after를 붙여준다.
		// 이 모든 것을 엮어주는게 weaving 
		
	}
}
