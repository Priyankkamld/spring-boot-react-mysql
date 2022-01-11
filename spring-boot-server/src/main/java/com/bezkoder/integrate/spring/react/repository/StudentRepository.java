package com.bezkoder.integrate.spring.react.repository;

import com.bezkoder.integrate.spring.react.model.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public Optional<Student> findByName(String name);
}
