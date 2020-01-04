package com.nobel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.model.Category;

public class SpringEntry {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Retrieving object from container...");
		
		Category category = context.getBean("category",Category.class);
		
		//category.setCatName("Watch");
	//	category.setCatDesc("Must wear watch");
		
		System.out.println(category);
	}
}
