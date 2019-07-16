package com.itp.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PutMapping
	public Product updateProduct(@RequestBody Product prod) {
		return service.add(prod);
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product prod) {
		return service.add(prod);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
	
	@GetMapping("/addProducts")
	public void addDummyProducts() {
		service.add(new Product(1, "Adidas"));
		service.add(new Product(2, "Printer"));
		service.add(new Product(3, "Laptop"));
	}
	
	

}
