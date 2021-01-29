package com.spatil.pservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spatil.pservice.model.Product;
import com.spatil.pservice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable(name="id") int id) {
		return productService.getProductById(id);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProductById(@PathVariable(name="id") int id) {
		productService.deleteProductById(id);
	}
	
	@PostMapping("/products/add")
	public Product save(@RequestBody Product product) {
		return productService.saveOrUpdate(product);
	}
	@PutMapping("/products")
	public Product update(@RequestBody Product product) {
		return productService.saveOrUpdate(product);
	}
}
