package com.bezkoder.integrate.spring.react.controller;

import com.bezkoder.integrate.spring.react.model.Student;
import com.bezkoder.integrate.spring.react.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@Autowired
	public StudentService love;
	
	@RequestMapping("/practice")
	public ResponseEntity<List<Student>> rag(){
		
		List<Student> jol = love.misti();
		
		HttpStatus status = HttpStatus.OK;
		
		ResponseEntity<List<Student>> fol = new ResponseEntity<List<Student>>(jol, status);
		
		
		
		return fol;
	}
	
	/*
	 * @RequestMapping("/rat") public ResponseEntity<List<Student>>
	 * vag(@RequestParam String name){
	 * 
	 * List<Student> hol = love.ayu(name);
	 * 
	 * HttpStatus status = HttpStatus.OK;
	 * 
	 * ResponseEntity<List<Student>> kol = new ResponseEntity<List<Student>>(hol,
	 * status);
	 * 
	 * return kol; }
	 */
	
	//database
	
	@RequestMapping("/kolkata")
	public ResponseEntity<Student> creativity(@RequestParam String name, @RequestParam String class1, @RequestParam String address, @RequestParam int mobile){
		
	/*	Student mou = love.creat(name, class1, address, mobile);
		
		HttpStatus status = HttpStatus.OK;
		
		ResponseEntity<Student> om = new ResponseEntity<Student>(mou, status);
		
		return om;
		*/
	
	 return new ResponseEntity<Student>(love.creat(name, class1, address,mobile), HttpStatus.OK);
	 
	}
	
	@RequestMapping("/update_student")
	public ResponseEntity<Student> updatable(@RequestParam String name, @RequestParam String class1, @RequestParam String address){
		return new ResponseEntity<Student>(love.update(name, class1, address),HttpStatus.OK);
	}
	
}
