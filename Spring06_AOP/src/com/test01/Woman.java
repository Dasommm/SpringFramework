package com.test01;

public class Woman {
	
	public void classWork() {
		System.out.println("출석카드를 찍는다");
	
		try {
			System.out.println("컴퓨터 켜서 쇼핑한다");
		} catch (Exception e) {
			System.out.println("쉬는날이었다.");
		}finally {
			System.out.println("집에 간다");
		}
	
	
	}

}
