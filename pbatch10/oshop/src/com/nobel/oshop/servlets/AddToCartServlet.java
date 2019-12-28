package com.nobel.oshop.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nobel.oshop.cart.ShoppingCart;
import com.nobel.oshop.model.CartProduct;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// addToCart?pid=5&prodName=Rolex%20Watch&price=12000&qty=1

		ServletContext context = getServletContext();

		int pid = Integer.parseInt(request.getParameter("pid"));
		int price = Integer.parseInt(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		String name = request.getParameter("prodName");

		CartProduct cartProduct = new CartProduct(pid, name, price, qty);

		ShoppingCart cart = (ShoppingCart) context.getAttribute("cart");
		if (cart == null) {
			cart = new ShoppingCart();
		}

		cart.addProduct(cartProduct);

		context.setAttribute("cart", cart);

		response.sendRedirect("listCart");

	}

}
