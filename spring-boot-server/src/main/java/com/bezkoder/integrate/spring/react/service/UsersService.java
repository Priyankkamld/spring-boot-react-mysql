package com.bezkoder.integrate.spring.react.service;

import com.bezkoder.integrate.spring.react.model.Users;
import com.bezkoder.integrate.spring.react.repository.UsersRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	@Autowired
	public UsersRepository mango;
	
	public List<Users> banana(){
		return mango.findAll();
	}
	
	public List<Users> orange(String username){
		return mango.findByUsername(username);
	}
	
	/**
	 * WE are inserting new user in database
	 * @param username 
	 * @param email 
	 * @param password 
	 */
	public Users createUser(String username, String email, String password) {
		Users abhi = new Users();
		abhi.setUsername(username);
		abhi.setEmail(email);
		abhi.setPassword(password);
		
		return mango.save(abhi);
	}
	/**
	 * users k update korchi by id
	 */
	public Users updateUserById(Long user_id, String email, String password) {
		Optional<Users> ram = mango.findById(user_id);
		
		Users raka = ram.orElse(new Users());
		
		raka.setEmail(email);
		raka.setPassword(password);
		
		return mango.save(raka);
		
	}
	/**
	 * user k delete korchi by id  
	 */
	public void deleteById(Long user_id) {
		mango.deleteById(user_id);
	}
}
