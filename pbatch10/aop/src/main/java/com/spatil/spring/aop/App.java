package com.spatil.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spatil.spring.aop.service.AccountService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		AccountService accountService = context.getBean("accountService", AccountService.class);
		
		accountService.validateCart(12345);
		
    }
}
