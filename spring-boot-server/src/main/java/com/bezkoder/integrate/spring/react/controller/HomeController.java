package com.bezkoder.integrate.spring.react.controller;

import com.bezkoder.integrate.spring.react.model.Tutorial;
import com.bezkoder.integrate.spring.react.service.TutorialService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	public TutorialService tutorialService;

	@RequestMapping("/database")
	public ResponseEntity<List<Tutorial>> vanny(){
		
		List<Tutorial> dal= tutorialService.pal();
		
		HttpStatus status = HttpStatus.OK;
		
		ResponseEntity<List<Tutorial>> bal = new ResponseEntity<List<Tutorial>>(dal, status);
		
		return bal;
	}


}
