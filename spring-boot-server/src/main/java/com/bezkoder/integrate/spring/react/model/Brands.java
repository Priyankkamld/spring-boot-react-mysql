package com.bezkoder.integrate.spring.react.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brands")
public class Brands {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brand_id;
	
	@Column(name= "brand_name")
	private String brandName;
	
	@Column(name="brand_active")
	private int brand_active;
	
	@Column(name="brand_status")
	private int brand_status;
	
	public Brands() {
		
	}
	
	public Brands(String brand_name, int brand_active, int brand_status) {
	this.brandName = brand_name;
	this.brand_active = brand_active;
	this.brand_status = brand_status;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getBrand_active() {
		return brand_active;
	}

	public void setBrand_active(int brand_active) {
		this.brand_active = brand_active;
	}

	public int getBrand_status() {
		return brand_status;
	}

	public void setBrand_status(int brand_status) {
		this.brand_status = brand_status;
	}
	
	@Override
	public String toString() {
		return "Brands [brand_id=" + brand_id + ", brandName=" + brandName + ", brand_active=" + brand_active + ", brand_status=" + brand_status + "]";
	}
}
