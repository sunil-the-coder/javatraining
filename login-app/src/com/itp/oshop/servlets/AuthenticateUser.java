package com.itp.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/authenticate")
public class AuthenticateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PreparedStatement ps = null;
	Connection conn = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		// String driver = config.getInitParameter("driver");

		// Save the config object in GenericServlet so that you can reuse later in
		// another methods.
		super.init(config);

		System.out.println("Obtaining Database Connection....");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobel", "sunil", "sunil@123");

			String authQuery = "select * from users where uname=? and passwd=?";
			ps = conn.prepareStatement(authQuery);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		System.out.println("Closing Database Connection....");
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Processing Request....");

		PrintWriter out = response.getWriter();

		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");

		try {
			if (ps != null) {
				ps.setString(1, username);
				ps.setString(2, password);

				ResultSet rs = ps.executeQuery();
				if (rs.next()) {

					// Create new session for logged in user.
					HttpSession session = request.getSession(false);

					if (session == null) {
						System.out.println("Session won't be created..");
					} else {
						System.out.println("ID:" + session.getId());
						session.setAttribute("currentUser", username);
						System.out.println("Timeout Period:" + session.getMaxInactiveInterval());
					}

				
					response.sendRedirect("categories");
				} else {
					response.sendRedirect("index.html");
				}

				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		out.close();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
