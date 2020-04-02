package com.test06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;


public class MyAspect {

	@Before
	public void before(JoinPoint join) {
		System.out.println("출첵");
	}
	
	public void after(JoinPoint join) {
		System.out.println("집");
	}
	
	
}
