package com.nobel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.model.Engine;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Engine engine = context.getBean("engine", Engine.class);

		engine.startEngine();
		engine.stopEngine();
	}
}
