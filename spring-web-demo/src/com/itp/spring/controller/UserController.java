package com.itp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itp.spring.model.User;

@Controller
public class UserController {

	@RequestMapping("/prepareUser")
	public ModelAndView populateUser() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addUser");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user) {
		
		System.out.println(user);
		return new ModelAndView("success", "msg", "User Added");
	}

}
