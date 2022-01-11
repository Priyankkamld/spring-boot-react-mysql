package com.bezkoder.integrate.spring.react.service;

import com.bezkoder.integrate.spring.react.model.Brands;
import com.bezkoder.integrate.spring.react.repository.BrandsRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandsService {
	
	@Autowired
	public BrandsRepository repository_1;
	
	public List<Brands> getAllBrands(){
		return repository_1.findAll();
	}
	
	public Optional<Brands> getByBrandName(String brand_name){
		return repository_1.findByBrandName(brand_name);
	}

	/**
	 * inserting new brand in database
	 */
	public Brands createBrand(String brand_name, int brand_active, int brand_status) {
		Brands insert = new Brands();
		insert.setBrandName(brand_name);
		insert.setBrand_active(brand_active);
		insert.setBrand_status(brand_status);
		
		return repository_1.save(insert);
	}
	/**
	 * updating brand by id
	 */
	public Brands updateBrandById(int brand_id, String brand_name, int brand_active, int brand_status) {
		Optional<Brands> update1 = repository_1.findById(brand_id);
		
		Brands update2 = update1.orElse(new Brands());
		
		update2.setBrandName(brand_name);
		update2.setBrand_active(brand_active);
		update2.setBrand_status(brand_status);
		return repository_1.save(update2);
	
	}
	/**
	 * deleting brand by Id 
	 */
	public void deleteingBrandById(int brand_id) {
		repository_1.deleteById(brand_id);
		
	}
	
}