package com.itp.oshop.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.hibernate.SessionFactory;

import com.itp.oshop.cart.ShoppingCart;

@WebListener
public class ApplicationHandler implements ServletContextListener,HttpSessionListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

		ServletContext context = arg0.getServletContext();
		SessionFactory sessionFactory = (SessionFactory) context.getAttribute("globalSessionFactory");
		if (sessionFactory != null)
			sessionFactory.close();

		context.removeAttribute("globalSessionFactory");

		System.out.println("Session Factory is closed..");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		ServletContext context = arg0.getServletContext();
		context.setAttribute("globalSessionFactory", sessionFactory);

		System.out.println("SessionFactory is initialized..");

	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub

		System.out.println("New session created & its captured by event for ID:"+arg0.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
		HttpSession session = arg0.getSession();
		
		//ShoppingCart cart = (ShoppingCart)session.getAttribute("shoppingCart");
		
		// Store all cart items into database along with this user details & 
		//retrieve back on login page once again from database
		
		System.out.println("Session is destroyed for ID:"+session.getId());
	}

}
