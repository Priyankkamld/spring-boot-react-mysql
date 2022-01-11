package com.bezkoder.integrate.spring.react.controller;

import com.bezkoder.integrate.spring.react.model.Brands;
import com.bezkoder.integrate.spring.react.service.BrandsService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BrandsController {
	
	@Autowired
	public BrandsService brandsService;
	
	@CrossOrigin(origins="*")
	@RequestMapping("/get_all_brand")
	public ResponseEntity<List<Brands>> brandsService1(){
		return new ResponseEntity<List<Brands>>(brandsService.getAllBrands(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping("/get_by_brandname")
	public ResponseEntity<Optional<Brands>> brandsService2(@RequestParam String brand_name){
		return new ResponseEntity<Optional<Brands>>(brandsService.getByBrandName(brand_name),HttpStatus.OK);
	}
	/**
	 * creating new brand in database
	 */
	
	@RequestMapping("/create_brand")
	public ResponseEntity<Brands> createNewBrand(@RequestParam String brand_name, @RequestParam int brand_active, @RequestParam int brand_status){
		return new ResponseEntity<Brands>(brandsService.createBrand(brand_name, brand_active, brand_status),HttpStatus.OK);
	}
	
	/**
	 * updating brand
	 * 
	 * @param brand_id
	 * @param brand_name
	 * @param brand_active
	 * @param brand_status
	 * @return
	 */
	@RequestMapping("/update_brand")
	public ResponseEntity<Brands> updateBrand(@RequestParam int brand_id, @RequestParam String brand_name, @RequestParam int brand_active, @RequestParam int brand_status){
		return new ResponseEntity<Brands>(brandsService.updateBrandById(brand_id, brand_name, brand_active, brand_status), HttpStatus.OK);
	}
	
	@RequestMapping("/delete_brand")
	public void deleteBrand(@RequestParam int brand_id) {
		brandsService.deleteingBrandById(brand_id);
	}
}
