package com.itp.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itp.oshop.cart.ShoppingCart;
import com.itp.oshop.model.CartProduct;

@WebServlet("/listCart")
public class ListCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession userSession = request.getSession(false);

		if (userSession != null) {

			PrintWriter out = response.getWriter();

			//ServletContext context = getServletContext();
			ShoppingCart cart = (ShoppingCart) userSession.getAttribute("cart");
			if (cart == null) {
				out.println("<h3> Currently, there are no items in your cart.</h3>");
				return;
			}

			String username = (String)userSession.getAttribute("currentUser");
			
			out.println("<html><body>");
			out.println("Welcome,"+username);
		
			// Display shopping cart in tabular format.
			
			out.println("<table border=1 width=50%>");
			out.println("<tr><th>Name</th><th>Price</th><th>Qty</th><th> Action</th></tr>");

			int total = 0;
			for (CartProduct p : cart.getProductsFromCart()) {
				total += p.getQty() * p.getPrice();
				out.println("<tr>");
				out.println("<td>" + p.getName() + "</td>");
				out.println("<td>" + p.getPrice() + "</td>");
				out.println("<td>" + p.getQty() + "</td>");
				out.println("<td><a href='remove?pid=" + p.getPid() + "'>Remove</a></td>");
				out.println("</tr>");
			}
			out.println("</table>");

			out.println("<h2> Total : Rs." + total + "</h2>");
			out.println("<h4><a href='categories'>Continue Shopping </a></h4>");
			out.println("<h4><a href='buy'>Buy</a>");
			out.println("<h4><a href='logout'>Logout</a>");

			out.println("</body></html>");

		} else {
			response.sendRedirect("index.html");
		}

	}

}
