package com.nobel.oshop.handler;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/admin/*"})
public class IPFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("ip filter destroy called...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//logic 1
		
		//currentUser -> Check role into database
		
		chain.doFilter(request, response);
		
		System.out.println("ip filter doFilter called...");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("ip filter init called...");
	}

}
