package com.itp.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itp.springbootdemo.model.Product;
import com.itp.springbootdemo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping
	public List<Product> getProducts() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		// logic retrieve product by id
		return service.getProductById(id);
	}

	@GetMapping("/addProducts")
	public void addDummyProducts() {
		service.add(new Product(1, "Adidas"));
		service.add(new Product(2, "Printer"));
		service.add(new Product(3, "Laptop"));

	}

}
