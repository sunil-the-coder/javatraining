package com.itp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authenticate")
public class AuthenticateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// out.println("Authenticating User.....");

		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");

		// DB Connection validation
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		String validationQuery = "select * from users where uname=? and passwd=?";
		try (Connection conn = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/nobel", 
						"sunil", "sunil@123");
				PreparedStatement ps = conn.prepareStatement(validationQuery);
				) {

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				response.sendRedirect("categories");
			} else {
				response.sendRedirect("index.html");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


		/*
		 * if (username.equals("sunil") && password.equals("patil")) { //
		 * out.println("Login Success."); // response.sendRedirect("categories"); } else
		 * { // response.sendRedirect("index.html");
		 * 
		 * RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		 * dispatcher.forward(request, response); }
		 */
		out.close();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
