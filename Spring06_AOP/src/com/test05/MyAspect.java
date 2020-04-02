package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Pointcut("execution(public * *(..))")
	public void myClass() {
		
	}
	
	@Before("myClass()")	//경로대신 해당 메소드를 적어준다.
	public void before(JoinPoint join) {
		System.out.println("출첵");
	}
	
	@After("myClass()")
	public void after(JoinPoint join) {
		System.out.println("집");
	}
	
}
