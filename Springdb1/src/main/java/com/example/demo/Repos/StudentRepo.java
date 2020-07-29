package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
	
	

}
