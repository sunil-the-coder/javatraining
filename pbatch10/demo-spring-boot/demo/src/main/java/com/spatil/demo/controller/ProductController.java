package com.spatil.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spatil.demo.model.Product;
import com.spatil.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hello, welcome to Spring Boot Application";
	}

	@GetMapping("/product")
	public Product getProduct() {
		return productService.getProduct();
	}
}
