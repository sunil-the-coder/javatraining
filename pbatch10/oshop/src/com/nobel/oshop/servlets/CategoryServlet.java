package com.nobel.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// Display categories..

		out.println("<html><body><table border=1>");
		out.println("<tr><th>Name</th><th>Description</th><th> Image </th> </tr>");

		out.println("<tr>");
		out.println("<td>Shoes</td>");
		out.println("<td>Must wear shoes </td>");
		out.println("<td><img src='images/shoes.jpeg' width='50%' height='50%'/></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Electronics</td>");
		out.println("<td>Must wear electrical devices in home </td>");
		out.println("<td><img src='images/electronics.jpeg' width='50%' height='50%'/></td>");
		out.println("</tr>");

		out.println("</table></body></html>");

		out.close();

	}

}
