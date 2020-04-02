package com.test01;

import org.springframework.stereotype.Component;

@Component
public class Nickname {	//해당 클래스를 bean으로 등록시켜준다. <bean id="nickname" class="com.test01.Nickname"/>과 동일하다.

	@Override
	public String toString() {
		return "som";
	}
	
	

}
