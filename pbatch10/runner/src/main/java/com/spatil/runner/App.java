package com.spatil.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spatil.runner.model.Category;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Retrieving object from container...");

		Category category1 = context.getBean("category", Category.class);
		System.out.println(category1);
		
		

	}
}
