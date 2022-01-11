package com.bezkoder.integrate.spring.react.repository;

import com.bezkoder.integrate.spring.react.model.Product;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Optional<Product> findByProductName(String productName);

}
