package com.itp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/persons")
public class PersonController {

	@RequestMapping(value="/addPerson",method = RequestMethod.POST)
	public void addPerson() {
		
	}
	
	@RequestMapping(value="/getAllPersons")
	public List<Person> getAllPerson() {
		
	}
	
	@RequestMapping(value="deletePerson")
	public void deletePerson() {
		
		
	}
}
