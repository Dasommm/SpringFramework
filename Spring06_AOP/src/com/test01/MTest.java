package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		Woman w = new Woman();
		Man m = new Man();
		
		System.out.println("여학생입장");
		w.classWork();
		System.out.println("------");
		System.out.println("남학생입장");
		m.classWork();
	}
	
}
