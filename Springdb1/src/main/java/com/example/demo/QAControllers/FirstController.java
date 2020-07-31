package com.example.demo.QAControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Student;
import com.example.demo.Repos.StudentRepo;

@RestController
public class FirstController {
	
	@Autowired
	StudentRepo repo;
	
	@GetMapping("/save")
	public String RecordSave() {
		
		Student ref = new Student();
		ref.setRegno(13);
		ref.setName("Shafeeq2");
		ref.setAddress("Manchester2");
		
		repo.save(ref);
		
		return "record save";
	}

}
