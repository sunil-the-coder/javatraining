package com.nobel.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.nobel.oshop.model.Product;
import com.nobel.shop.hibernate.util.HibernateUtil;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// Display categories..

		int catId = Integer.parseInt(request.getParameter("catId"));

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Product.class);
		criteria.add(Restrictions.eq("catId", catId));

		List<Product> products = (List<Product>) criteria.list();
		System.out.println("products:"+products);

		out.println("<html><body><table border=1>");
		out.println("<tr><th>Name</th><th>Description</th><th>Price</th><th> Image </th><th>Action</th> </tr>");

		for (Product prod : products) {
			out.println("<tr>");
			out.println("<td>" + prod.getProdName() + "</td>");
			out.println("<td>" + prod.getProdDesc() + "</td>");
			out.println("<td>" + prod.getPrice() + "</td>");
			out.println("<td><img src='images/" + prod.getProdImgUrl() + "' width='50%' height='50%'/></td>");
			out.println("<td><a href='addToCart?pid="+prod.getPid()+"&prodName="+prod.getProdName()+"&price="+prod.getPrice()+"&qty=1'>AddToCart</a></td>");
			out.println("</tr>");
		}

		out.println("</table></body></html>");

		session.close();
		

		out.close();

	}

}
