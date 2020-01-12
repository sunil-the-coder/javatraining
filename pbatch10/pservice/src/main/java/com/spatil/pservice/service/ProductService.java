package com.spatil.pservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spatil.pservice.model.Product;
import com.spatil.pservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepository;

	public List<Product> getAllProducts() {
		return prodRepository.findAll();
	}

	public Product getProductById(int id) {
		Optional<Product> findById = prodRepository.findById(id);
		return findById.get();
	}

	public Product saveOrUpdate(Product product) {
		return prodRepository.save(product);
	}

	public void deleteProductById(int id) {
		prodRepository.deleteById(id);
	}

}
