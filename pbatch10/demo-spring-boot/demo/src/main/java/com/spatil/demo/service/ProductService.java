package com.spatil.demo.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.spatil.demo.model.Product;
import com.spatil.demo.model.UserRating;

@Service
public class ProductService {

	public Product getProduct() {
		Product prod = new Product(10, 1, "Adidas Shoes", "Must wear shoes", "adidas.jpg", 5000, 2);
		prod.setReviews(Arrays.asList(new UserRating("Sunil", 5), new UserRating("Ganesh", 4)));
		return prod;
	}
}
