package com.itp.oshop.servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itp.oshop.cart.ShoppingCart;
import com.itp.oshop.model.CartProduct;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession userSession = request.getSession(false);
		
		if (userSession != null) {

		// ?pid=5&pname=Rolex%20Watch&price=12000&qty=1
		
		int pid = Integer.parseInt(request.getParameter("pid"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		int price = Integer.parseInt(request.getParameter("price"));
		String pname = request.getParameter("pname");

		CartProduct cartProduct = new CartProduct(pid, pname, price, qty);

		// Database store / In Memory shopping Cart

		//ServletContext context = getServletContext();
		ShoppingCart cart  = (ShoppingCart)userSession.getAttribute("cart");
		if(cart == null) {
			cart = new ShoppingCart();
			userSession.setAttribute("cart", cart);
		}
		
		cart.addProduct(cartProduct);

	//	RequestDispatcher dispatcher = request.getRequestDispatcher("listCart");
	//	dispatcher.forward(request, response);
		
		response.sendRedirect("listCart");
		}else {
			response.sendRedirect("index.html");
		}
	}

}
