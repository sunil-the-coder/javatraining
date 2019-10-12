package com.itp.spring.hibernate;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateInitializer {

	private String configFile;
	
	private SessionFactory sessionFactory;

	@Autowired
	private ServletContext context;
	
	public String getConfigFile() {
		return configFile;
	}

	public void setConfigFile(String configFile) {
		this.configFile = configFile;
	}

	public void initializeHibernate() {
		
		Configuration config = new Configuration();
		config.configure(configFile);

		// 2. Build session factory from configuration.
		sessionFactory = config.buildSessionFactory();
		context.setAttribute("sessionFactory", sessionFactory);
	}
	
	public void destroyHibernate() {
		sessionFactory = (SessionFactory)context.getAttribute("sessionFactory");
		if(sessionFactory != null) {
			sessionFactory.close();
			context.removeAttribute("sessionFactory");
		}
	}
}
