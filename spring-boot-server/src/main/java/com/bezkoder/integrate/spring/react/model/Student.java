package com.bezkoder.integrate.spring.react.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long roll;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "class")
		private String class1;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "mobile")
		private int mobile;
		
		
		public Student() {

		}

		public Student(String name, String class1, String address,int mobile) {
			this.name = name;
			this.class1 = class1;
			this.address= address;
			this.mobile = mobile;
		}
		
		

		public long getRoll() {
			return roll;
		}

		public void setRoll(long roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClass1() {
			return class1;
		}

		public void setClass1(String class1) {
			this.class1 = class1;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getMobile() {
			return mobile;
		}

		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		
		
		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", class1=" + class1 + ", address=" + address + ", mobile=" + mobile + "]";
		}
		
}
