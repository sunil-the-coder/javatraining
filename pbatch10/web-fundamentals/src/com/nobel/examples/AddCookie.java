package com.nobel.examples;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookie
 */
@WebServlet("/AddCookie")
public class AddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Cookie userName =  new Cookie("user", "Sunil");
		Cookie lastVisited =  new Cookie("lastVisited", LocalDateTime.now().toString());
		
		lastVisited.setMaxAge(300);
		
		response.addCookie(userName);
		response.addCookie(lastVisited);
		
		response.getWriter().println("Cookies has been added");
	}

}
