package com.mvc.ex01.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {
	
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {	//해당 필터가 실행될때 

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest)request;
		String remoteAddr = req.getRemoteAddr();
		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String referer = req.getHeader("referer");
		String agent = req.getHeader("User-Agent");
		
		StringBuffer sb = new StringBuffer();
			sb.append("* remoteAddr :"+remoteAddr+"\n")
				.append("* uri :"+uri+"\n")
				.append("* url :"+url+"\n")
				.append("* queryString :"+queryString+"\n")
				.append("* referer :"+referer+"\n")
				.append("* agent :"+agent+"\n");
		
			logger.info("LOG FILTERRRRRRRRR : \n"+sb);
		
			chain.doFilter(req, response);
		
	}

	@Override
	public void destroy() {		//해당 필터가 종료될 때 

	}

}
