package com.nobel.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.spring.dao.CategoryDao;
import com.nobel.spring.model.Category;

public class SpringJdbcTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		CategoryDao categoryDao = context.getBean("categoryDao",CategoryDao.class);
		
		Category category = context.getBean("category",Category.class);
		//categoryDao.save(category);

		List<Category> categories = categoryDao.findAll();
		
		for(Category cat: categories)
			System.out.println(cat);

	}
}
