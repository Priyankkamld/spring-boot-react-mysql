package com.bezkoder.integrate.spring.react.controller;

import com.bezkoder.integrate.spring.react.model.Product;
import com.bezkoder.integrate.spring.react.service.ProductService;

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
public class ProductController {
	
	@Autowired
	public ProductService productService;

	@CrossOrigin(origins="*")
	@RequestMapping("/get_all_product")
	public ResponseEntity<List<Product>> productService1(){
		return new ResponseEntity<List<Product>>(productService.getAllProduct(),HttpStatus.OK);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping("/get_by_productName")
	public ResponseEntity<Optional<Product>> productService2(@RequestParam String product_name){
		return new ResponseEntity<Optional<Product>>(productService.getByProductName(product_name),HttpStatus.OK); 
	}
	
	/**
	 * creating_product
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
	@RequestMapping("/create_product")
	public ResponseEntity<Product> createNewProduct(@RequestParam String product_name,@RequestParam String product_image,@RequestParam int brand_id,@RequestParam int categorise_id,@RequestParam String quantity,@RequestParam String rate,@RequestParam int active,@RequestParam int status,@RequestParam String barcode){
		return new ResponseEntity<Product>(productService.creatProduct(product_name, product_image, brand_id, categorise_id, quantity, rate, active, status, barcode),HttpStatus.OK);
	}
	/**
	 * updating_product
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
	@RequestMapping("/update_product")
	public ResponseEntity<Product> updateProduct(@RequestParam int product_id,@RequestParam String product_name,@RequestParam String product_image,@RequestParam int brand_id,@RequestParam int categorise_id,@RequestParam String quantity,@RequestParam String rate,@RequestParam int active,@RequestParam int status,@RequestParam String barcode){
		System.out.println("Hi");
		return new ResponseEntity<Product>(productService.productById(product_id, product_name, product_image, brand_id, categorise_id, quantity, rate, active, status, barcode),HttpStatus.OK);
	}
	
	/**
	 * deleting product
	 * @param product_id
	 */
	@RequestMapping("/delete_product")
	public void deleteProduct(@RequestParam int product_id) {
		productService.deleteById(product_id);
	}
	
}
