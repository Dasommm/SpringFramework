package com.mvc.upgrade.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {

	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());	// 대상 객체
		//Logger logger = LoggerFactory.getLogger(join.getTarget()+"");  이렇게 String type으로 바꿔도 된다.
		
		Object[] args = join.getArgs();	//대상 파라미터
		if(args != null) {
			logger.info("method :"+join.getSignature().getName());	//getSignature : 대상 메서드 정보 
			for(int i = 0; i < args.length;i++) {
				logger.info(i+"번 : "+args[i]);
			}			
		}		
	}
	
	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());
		logger.info("-----------AOP END------------");
	}
	
	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());
		logger.info("------ERROR--------");
		logger.info("ERROR :"+join.getArgs());
		logger.info("ERROR :"+join.toString());
		
	}
	
}
