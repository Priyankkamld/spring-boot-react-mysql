package com.bezkoder.integrate.spring.react.repository;

import com.bezkoder.integrate.spring.react.model.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long>{
	public List<Users> findByUsername(String username);
}
