package com.itp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.spring.beans.Product;

public class Entry {

	public static void main(String[] args) {
		
		//1. Load application context - IoC container.
	
		System.out.println("Loading context...");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("context loaded...");
		
		Product prod = context.getBean("prod",Product.class);

		System.out.println(prod);
		
		
	//	Product prod = new Product();		
		//prod.setId(40);
		//prod.setName("Printer");
		
		
		
		
	}
}
