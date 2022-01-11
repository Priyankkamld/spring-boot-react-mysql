package com.bezkoder.integrate.spring.react.repository;

import com.bezkoder.integrate.spring.react.model.Brands;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandsRepository extends JpaRepository<Brands, Integer>{
	
	public Optional<Brands> findByBrandName(String brandName);

}
