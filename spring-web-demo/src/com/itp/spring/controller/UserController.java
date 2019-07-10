package com.itp.spring.controller;

import javax.servlet.ServletContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itp.spring.model.User;

@Controller
public class UserController {

	@Autowired
	private ServletContext context;

	@RequestMapping("/prepareUser")
	public ModelAndView populateUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addUser");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user) {

		SessionFactory sessionFactory = (SessionFactory) context.getAttribute("sessionFactory");

		Session session = sessionFactory.openSession();

		Transaction txn = session.beginTransaction();

		session.save(user);

		txn.commit();

		session.close();

		System.out.println(user);

		return new ModelAndView("success", "msg", "User Added");
	}

}
