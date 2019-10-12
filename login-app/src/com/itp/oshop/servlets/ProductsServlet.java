package com.itp.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.itp.oshop.model.Product;
import com.itp.oshop.util.HibernateUtil;

@WebServlet("/products")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession userSession = request.getSession(false);

		if (userSession != null) {

			PrintWriter out = response.getWriter();

			if (request.getParameter("catId") != null) {

				int catId = Integer.parseInt(request.getParameter("catId"));

				ServletContext context = getServletContext();
				SessionFactory sessionFactory = (SessionFactory)context.getAttribute("globalSessionFactory");
				Session session = sessionFactory.openSession();

				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.eq("catId", catId));
				List<Product> products = (List<Product>) criteria.list();

				/*
				 * Query query =
				 * session.createQuery("select OBJECT(p) from Product p where catId=?");
				 * query.setParameter(0, catId);
				 * 
				 * List<Product> products = (List<Product>) query.list();
				 */

				// System.out.println(products);

				String username = (String)userSession.getAttribute("currentUser");
				
				out.println("<html><body>");
				out.println("Welcome,"+username);
				out.println("<table border=1 width=50%>");
				out.println("<tr><th>Name</th><th>Description</th><th>Price</th><th> Image </th><th>Action</th></tr>");

				products.stream().forEach(p -> {
					out.println("<tr>");
					out.println("<td>" + p.getName() + "</td>");
					out.println("<td>" + p.getDescription() + "</td>");
					out.println("<td>" + p.getPrice() + "</td>");
					out.println("<td><img src='Images/" + p.getImgUrl() + "' width='50%' height='50%'></img></td>");
					out.println("<td><a href='addToCart?pid=" + p.getPid() + "&pname=" + p.getName() + "&price="
							+ p.getPrice() + "&qty=1'>AddToCart</a>&nbsp;&nbsp;<a href='buy'>Buy</a></td>");
					out.println("</tr>");
				});

				out.println("</table></body></html>");

				session.close();

				out.close();
			}
		} else {
			response.sendRedirect("index.html");
		}
	}

}
