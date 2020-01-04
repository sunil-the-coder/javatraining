package com.nobel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.model.Category;

public class SpringEntry {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Retrieving object from container...");
		
		Category category1 = context.getBean("category",Category.class);
		Category category2 = context.getBean("category",Category.class);
		Category category3 = context.getBean("category",Category.class);
		
		Category categoryTest1 = context.getBean("categoryTest",Category.class);
		Category categoryTest2 = context.getBean("categoryTest",Category.class);
		
		System.out.println(category1);
		System.out.println(category2);
		
		
	}
}
