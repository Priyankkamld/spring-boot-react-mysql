package com.bezkoder.integrate.spring.react.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_image")
	private String productImage;
	
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "categories_id")
	private int categoriesId;
	
	@Column(name = "quantity")
	private String quantity;
	
	@Column(name = "rate")
	private String rate;
	
	@Column(name = "active")
	private int active;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "barcode")
	private String barcode;
	
	
	public Product() {
		
	}
	
	public Product(String product_name, String product_image, int brand_id, int categories_id, String quantity, String rate, int active, int status, int barcode ) {
		this.productName = product_name;
		this.productImage = product_image;
		this.brandId = brand_id;
		this.categoriesId = categories_id;
		this.quantity = quantity;
		this.rate = rate;
		this.active = active;
		this.status = barcode;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(int categoriesId) {
		this.categoriesId = categoriesId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", productName=" + productName + ", productImage=" + productImage +", brandId=" + brandId +", categoriesId=" + categoriesId + ", quantity=" + quantity + ", rate=" + rate + ", active=" + active + ", status=" + status + ", barcode=" + barcode +" ]";
	}
}
