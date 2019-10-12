package com.itp.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.itp.springbootdemo.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	/*
	 * List<Product> findByNameOrderByAsc(String name);
	 * 
	 * @Query(name = "select * from products",nativeQuery = true) List<Product>
	 * getProducts();
	 */
}
