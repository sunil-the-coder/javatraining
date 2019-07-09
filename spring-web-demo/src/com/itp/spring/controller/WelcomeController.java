package com.itp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayWelcome() {
		ModelAndView modelAndView = new ModelAndView();
		//View name - The name of the file ( eg. welcome.jsp, hello.fm )
		modelAndView.setViewName("welcome");
		
		//Data that you want to send on view - ( key | value pair )
		modelAndView.addObject("msg", "Welcome to Spring Web MVC Application");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/task")
	public String doTask() {
		return "task";
	}
}
