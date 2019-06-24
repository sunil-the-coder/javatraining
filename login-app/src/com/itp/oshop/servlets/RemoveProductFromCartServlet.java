package com.itp.oshop.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itp.oshop.cart.ShoppingCart;

@WebServlet("/remove")
public class RemoveProductFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession userSession = request.getSession(false);

		if (userSession != null) {

			int pid = Integer.parseInt(request.getParameter("pid"));

			ShoppingCart cart = (ShoppingCart) userSession.getAttribute("cart");
			cart.remove(pid);

			response.sendRedirect("listCart");
		}else {
			response.sendRedirect("index.html");
		}

	}

}
