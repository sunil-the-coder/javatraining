package com.itp.oshop.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class OshopInitializer
 */
@WebServlet(urlPatterns = { "/init" }, loadOnStartup = 1)
public class OshopInitializer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		
		//Load sessionFactory here...
		System.out.println("Oshop is initialized....");
	}

}
