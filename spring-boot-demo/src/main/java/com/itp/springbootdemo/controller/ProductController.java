package com.itp.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/search")
	public List<Product> search(@RequestParam String name,@RequestParam String brand,@RequestParam String price) {
		
		//search on database - Hibernate Search
		return null;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getProductById(@PathVariable int id) {
		Product product = service.getProductById(id);
		if(product  == null) {
			return new ResponseEntity<>("Requested Product Not available",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(product,HttpStatus.OK);
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product prod) {
		//Permission -> role
		/*
		 * if(role == "USER") { return new ResponseEntity<T>(HttpStatus.UNAUTHORIZED) }
		 */
		
		Product product = service.add(prod);
		return product;
	}
	
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody Product prod) {
		Product product = service.add(prod);
		ResponseEntity<Product> response = new ResponseEntity<Product>(product, HttpStatus.CREATED);
		return response;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		Product product = service.getProductById(id);
		if(product  == null) {
			return new ResponseEntity<>("Requested Product Not available",HttpStatus.NOT_FOUND);
		}
		
		service.delete(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/addProducts")
	public void addDummyProducts() {
		service.add(new Product(1, "Adidas"));
		service.add(new Product(2, "Printer"));
		service.add(new Product(3, "Laptop"));
	}
	
	

}
