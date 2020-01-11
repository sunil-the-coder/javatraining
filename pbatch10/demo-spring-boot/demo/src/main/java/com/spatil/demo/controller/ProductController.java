package com.spatil.demo.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spatil.demo.model.Product;
import com.spatil.demo.model.UserRating;

@RestController
public class ProductController {

	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hello, welcome to Spring Boot Application";
	}

	@GetMapping("/product")
	public Product getProduct() {
		Product prod = new Product(10, 1, "Adidas Shoes", "Must wear shoes", "adidas.jpg", 5000, 2);
		prod.setReviews(Arrays.asList(new UserRating("Sunil", 5),new UserRating("Ganesh", 4)));
		return prod;
	}
}
