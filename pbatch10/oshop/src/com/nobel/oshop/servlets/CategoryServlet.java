package com.nobel.oshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nobel.oshop.model.Category;

@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession(false);

		if (httpSession  == null) {
			response.sendRedirect("index.html");
		} else {
			PrintWriter out = response.getWriter();

			// Display categories..
			
			ServletContext context = getServletContext();
			SessionFactory sessionFactory = (SessionFactory) context.getAttribute("sessionFactory");

			Session session = sessionFactory.openSession();

			Query query = session.createQuery("from Category");

			List<Category> categories = (List<Category>) query.list();

			//response.sendRedirect("categories.jsp");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("categories.jsp");
			request.setAttribute("categories", categories);
			dispatcher.forward(request, response);
		

//			out.println("<html><body>");
//			out.println("<h2> Welcome, "+httpSession.getAttribute("currentUser")+"</h2>");
//			out.println("<table border=1>");
//			out.println("<tr><th>Name</th><th>Description</th><th> Image </th> </tr>");
//
//			for (Category category : categories) {
//				out.println("<tr>");
//				out.println("<td>" + category.getCatName() + "</td>");
//				out.println("<td>" + category.getCatDesc() + "</td>");
//				out.println("<td><a href='products?catId=" + category.getId() + "'><img src='images/"
//						+ category.getCatImgUrl() + "' width='50%' height='50%'/></a></td>");
//				out.println("</tr>");
//			}
//
//			out.println("</table></body></html>");

			session.close();

			out.close();
		}
	}

}
