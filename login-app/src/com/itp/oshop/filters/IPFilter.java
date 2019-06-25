package com.itp.oshop.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/admin/*" })
public class IPFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("IP filter destroy is called...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("IP filter doFilter is called...");

		String host = request.getRemoteAddr();

		System.out.println("Host IP:"+host);
		if (host.startsWith("127.0.0") || host.startsWith("0:0:0:0") || host.startsWith("192.168.0.15")) {
			chain.doFilter(request, response);
		} else {
			response.getWriter()
					.println("You are not authorized to access this page. Please connect with support team.");
			return;
		}

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("IP filter init is called...");
	}

}
