package com.itp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class AuthenticateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		//out.println("Authenticating User.....");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		//DB Connection validation
		
		if(username.equals("sunil") && password.equals("patil")) {
		//	out.println("Login Success.");
			response.sendRedirect("categories");
		}else {
			//response.sendRedirect("index.html");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.forward(request, response);
		}
		
		out.close();
	}

}
