package com.nobel.oshop.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nobel.oshop.cart.ShoppingCart;

/**
 * Servlet implementation class DeleteProductFromCart
 */
@WebServlet("/removeFromCart")
public class DeleteProductFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession(false);

		if (httpSession == null) {
			response.sendRedirect("index.html");
		} else {
			int pid = Integer.parseInt(request.getParameter("pid"));

			//ServletContext context = getServletContext();
			ShoppingCart cart = (ShoppingCart) httpSession.getAttribute("cart");

			cart.delete(pid);

			response.sendRedirect("listCart");

		}
	}

}
