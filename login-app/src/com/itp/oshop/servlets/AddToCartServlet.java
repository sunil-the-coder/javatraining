package com.itp.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.oshop.model.CartProduct;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ?pid=5&pname=Rolex%20Watch&price=12000&qty=1
		int pid = Integer.parseInt(request.getParameter("pid"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		int price = Integer.parseInt(request.getParameter("price"));
		String pname = request.getParameter("pname");

		CartProduct cartProduct = new CartProduct(pid, pname, price, qty);

		// Database store / In Memory shopping Cart

		ServletContext context = getServletContext();
		List<CartProduct> cart  = (List<CartProduct>)context.getAttribute("cart");
		if(cart == null) {
			cart = new LinkedList<>();
			context.setAttribute("cart", cart);
		}
		
		cart.add(cartProduct);

	//	RequestDispatcher dispatcher = request.getRequestDispatcher("listCart");
	//	dispatcher.forward(request, response);
		
		response.sendRedirect("listCart");
	}

}
