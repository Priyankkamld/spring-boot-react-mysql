package com.bezkoder.integrate.spring.react.service;

import com.bezkoder.integrate.spring.react.model.Product;
import com.bezkoder.integrate.spring.react.repository.ProductRepository;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
		
	}
	
	public Optional<Product> getByProductName(String productName){
		return productRepository.findByProductName(productName);
	}
	/**
	 * inserting new product in data base
	 */

	public Product creatProduct(String product_name, String product_image, int brand_id, int categorise_id, String quantity, String rate, int active, int status, String barcode) {
		Product insert = new Product();
		insert.setProductName(product_name);
		insert.setProductImage(product_image);
		insert.setBrandId(brand_id);
		insert.setCategoriesId(categorise_id);
		insert.setQuantity(quantity);
		insert.setRate(rate);
		insert.setActive(active);
		insert.setStatus(status);
		insert.setBarcode(barcode);
		return productRepository.save(insert);
		
	}
	/**
	 * update
	 * @param product_id
	 * @param product_name
	 * @param product_image
	 * @param brand_id
	 * @param categorise_id
	 * @param quantity
	 * @param rate
	 * @param active
	 * @param status
	 * @param barcode
	 * @return
	 */
	public Product productById(int product_id, String product_name, String product_image, int brand_id, int categorise_id, String quantity, String rate, int active, int status, String barcode) {
		
		Optional<Product> updating = productRepository.findById(product_id);
		Product updating2 = updating.orElse(new Product());
		
		updating2.setProduct_id(product_id);
		updating2.setProductName(product_name);
		updating2.setProductImage(product_image);
		updating2.setBrandId(brand_id);
		updating2.setCategoriesId(categorise_id);
		updating2.setQuantity(quantity);
		updating2.setRate(rate);
		updating2.setActive(active);
		updating2.setStatus(status);
		updating2.setBarcode(barcode);
		
		return productRepository.save(updating2);
		
	}
	
	/**
	 * deleting product by id
	 * 
	 */
	public void deleteById(int product_id) {
		
		productRepository.deleteById(product_id);
	}
}
