package com.itp.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.springbootdemo.model.Product;
import com.itp.springbootdemo.repository.ProductRepository;

@Service
public class ProductService {

	//private List<Product> products = new LinkedList<>();

	@Autowired
	private ProductRepository repository;
	
	public void add(Product prod) {
		repository.save(prod);
	}

	public List<Product> getAll() {
		return repository.findAll();
	}

	public Product getProductById(int id) {
		return repository.findById(id).get();
	}

	public void delete(int id) {
		repository.deleteById(id);
	}

	public void udpate(Product prod) {
		// will add logic later....
	}
}
