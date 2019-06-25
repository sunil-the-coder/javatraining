package com.itp.oshop.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.hibernate.SessionFactory;

import com.itp.oshop.util.HibernateUtil;

/**
 * Servlet implementation class OshopInitializer
 */
@WebServlet(urlPatterns = { "/init" }, loadOnStartup = 100)
public class OshopInitializer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		//Load sessionFactory here...
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		ServletContext context = getServletContext();
		context.setAttribute("globalSessionFactory", sessionFactory);
		
		System.out.println("Oshop is initialized & Prepared the session factory");
	}

}
