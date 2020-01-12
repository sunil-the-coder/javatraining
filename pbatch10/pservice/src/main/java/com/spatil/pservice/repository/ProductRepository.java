package com.spatil.pservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spatil.pservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{}
