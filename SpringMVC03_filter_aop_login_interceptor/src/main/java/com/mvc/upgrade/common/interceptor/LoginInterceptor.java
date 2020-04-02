package com.mvc.upgrade.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	
	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	//interceptor : 요청을 가로챈다. Handler Mapping을 가로챈다

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {	//하기전에 
		logger.info("[INTERCEPTOR] : preHandle");
		
		if(request.getRequestURI().contains("/loginform.do") || 
		request.getRequestURI().contains("/ajaxlogin.do") || 
		request.getSession().getAttribute("login") != null ||
		request.getRequestURI().contains("/joinform.do") ||
		request.getRequestURI().contains("/join.do")) {
			return true;
		}
		
		if(request.getSession().getAttribute("login") == null){
			response.sendRedirect("loginform.do");
		}
		
		
		
		
		return false;	//false인 경우 요청된걸 다 막아준다.
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception { //하고난 다음에
		logger.info("[INTERCEPTOR] : postHandle");


	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {	//다 끝난 다음에
		logger.info("[INTERCEPTOR] : afterCompletion");

			
	}

}
