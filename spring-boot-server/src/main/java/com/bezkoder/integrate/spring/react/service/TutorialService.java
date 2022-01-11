package com.bezkoder.integrate.spring.react.service;

import com.bezkoder.integrate.spring.react.model.Tutorial;
import com.bezkoder.integrate.spring.react.repository.TutorialRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorialService {

	@Autowired
	public TutorialRepository panto;

	public List<Tutorial> pal() {

		return panto.findAll();
	}
}
