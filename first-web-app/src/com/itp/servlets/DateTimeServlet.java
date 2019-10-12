package com.itp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		// 1. Get the writer object
		PrintWriter out = response.getWriter();

		Date currentTime = new Date();

		out.println("<html><body>");
		out.println("<h4>" + currentTime + "</h4>");
		out.println("</body></html>");

		out.close();
	}

}
