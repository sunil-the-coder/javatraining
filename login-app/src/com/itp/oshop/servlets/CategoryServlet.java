package com.itp.oshop.servlets;

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

import com.itp.oshop.model.Category;
import com.itp.oshop.util.HibernateUtil;

@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Fetch categories from database & display it in table.

		PrintWriter out = response.getWriter();

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Category.class);
		List<Category> categories = (List<Category>) criteria.list();

		out.println("<html><body>");
		out.println("<table border=1 width=50%>");
		out.println("<tr><th>Name</th><th>Description</th><th> Image </th></tr>");

		categories.stream().forEach(c -> {
			out.println("<tr>");
			out.println("<td>" + c.getCatName() + "</td>");
			out.println("<td>" + c.getCatDesc() + "</td>");
			out.println("<td>" + c.getCatImgUrl() + "</td>");
			out.println("</tr>");
		});

		out.println("</table></body></html>");

		session.close();

		sessionFactory.close();

	}

}
