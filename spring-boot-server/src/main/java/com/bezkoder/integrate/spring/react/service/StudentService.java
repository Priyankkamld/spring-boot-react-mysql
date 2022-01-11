package com.bezkoder.integrate.spring.react.service;

import com.bezkoder.integrate.spring.react.model.Student;
import com.bezkoder.integrate.spring.react.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository adi;
	
	public List<Student> misti(){
		
		return adi.findAll();
	}

	/*
	 * public List<Student> ayu( String name){ return adi.findByName(name); }
	 */
	
	//database
	public Student creat(String name, String class1, String address, int mobile) {
		Student som = new Student();
		som.setName(name);
		som.setClass1(class1);
		som.setAddress(address);
		som.setMobile(mobile);
		
		return adi.save(som);
	}
	
	/**
	 * student k update korchi by name
	 * @return
	 */
	public Student update(String name, String class1, String address) {
		Optional<Student> panto = adi.findByName(name);
		
		Student rup = panto.orElse(new Student());
		
		rup.setName(name);
		rup.setAddress(address);
		rup.setClass1(class1);
		
		return adi.save(rup);
	}
} 
