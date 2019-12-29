package com.nobel.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateSession
 */
@WebServlet("/RetrieveSession")
public class RetrieveSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		PrintWriter out = response.getWriter();

		if (session == null) {
			out.println("No Session has been created.");
		} else {

			out.println("Current User:"+session.getAttribute("currentUser"));

			out.println("Creation Time:" + new Date(session.getCreationTime()));
			out.println("Last Access Time:" + new Date(session.getLastAccessedTime()));
			out.println("MaxInactiveInterval:" + session.getMaxInactiveInterval());
			out.println("Session ID:" + session.getId());

		}

		// HttpSession session = request.getSession(false);
	}

}
