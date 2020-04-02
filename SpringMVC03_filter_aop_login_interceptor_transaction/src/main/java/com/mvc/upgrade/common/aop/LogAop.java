package com.mvc.upgrade.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {
	
	public void before(JoinPoint join) {
		
		Logger logger = LoggerFactory.getLogger(join.getTarget() + "");	
		logger.info("------- AOP START------");
		
		Object[] args = join.getArgs();
		
		if(args != null) {
			logger.info("method : " + join.getSignature().getName());
			for(int i = 0; i < args.length; i++) {
				logger.info(i + "번 : " + args[i]);
			}
		}
		
		/*
		    join.getTarget() : 대상 객체
		    join.getArgs() : 대상 파라미터
		    join.getSignature() : 대상 메서드 정보 
		 
		 */
		
	}
	
	public void after(JoinPoint join) {
		
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());
		logger.info("------ AOP END ------");
		
		
	}
	
	public void afterThrowing(JoinPoint join) {
		
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());
		logger.info(("------ERROR------"));
		logger.info("ERROR : " + join.getArgs());
		logger.info("ERROR : " + join.toString());
		
	}
	
}
