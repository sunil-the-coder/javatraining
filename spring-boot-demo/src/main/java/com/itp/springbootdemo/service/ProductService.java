package com.itp.springbootdemo.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itp.springbootdemo.model.Product;

@Service
public class ProductService {

	private List<Product> products = new LinkedList<>();

	public void add(Product prod) {
		products.add(prod);
	}

	public List<Product> getAll() {
		return products;
	}

	public Product getProductById(int id) {
		return products.get(id);
	}

	public void delete(int id) {
		products.remove(id);
	}

	public void udpate(Product prod) {
		// will add logic later....
	}
}
