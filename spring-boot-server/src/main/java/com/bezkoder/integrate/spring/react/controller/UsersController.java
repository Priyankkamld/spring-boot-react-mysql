package com.bezkoder.integrate.spring.react.controller;

import com.bezkoder.integrate.spring.react.model.Users;
import com.bezkoder.integrate.spring.react.service.UsersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {

	@Autowired
	public UsersService tormuj;
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/friday")
	public ResponseEntity<List<Users>> jam(){
		List<Users> lebu = tormuj.banana();
		
		HttpStatus status = HttpStatus.OK;
		
		ResponseEntity<List<Users>> aam = new ResponseEntity<List<Users>>(lebu, status);
		
		return aam;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/fsokal")
	public ResponseEntity<List<Users>> sam(@RequestParam String username){
		List<Users> kola = tormuj.orange(username);
		
		HttpStatus status = HttpStatus.OK;
		
		ResponseEntity<List<Users>> sosa = new ResponseEntity<List<Users>>(kola, status);
		
		return sosa;
	}
	
	/**
	 * For creating new user in database
	 * @param username
	 * @param email
	 * @param password
	 */
	@RequestMapping("/createuser")
	public ResponseEntity<Users> createNewUser(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
		return new ResponseEntity<Users>(tormuj.createUser(username, email, password), HttpStatus.OK);
	}
	
	@RequestMapping("/update_user")
	public ResponseEntity<Users> updating(@RequestParam Long user_id, @RequestParam String email, @RequestParam String password)
	{
		return new ResponseEntity<Users>(tormuj.updateUserById(user_id, email, password), HttpStatus.OK);
	}
	
	@RequestMapping("/delete_user")
	public void deleting(@RequestParam Long user_id) {
		tormuj.deleteById(user_id);
	}
}
