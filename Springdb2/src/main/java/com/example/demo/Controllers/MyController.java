package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Student;
import com.example.demo.Repositories.StudentRepository;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
	StudentRepository studentRepo;
	
	@GetMapping("/save")
	public String saveRecord() {
		
		Student s = new Student();
		s.setRegno(1);
		s.setName("shafeeq");
		s.setAddress("Salford");
		
		studentRepo.save(s);
		
		return "record Saved";
	}
	
	@GetMapping("/save/{id}/{name}/{place}")
	public String saveRecord2(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("place") String place) {
		
		Student s = new Student();
		s.setRegno(id);
		s.setName(name);
		s.setAddress(place);
		
		studentRepo.save(s);
		
		return "record Saved";
	}
	
	@GetMapping("/findrecord/{id}")
	public Student findRecord(@PathVariable("id") int id) {
		Optional<Student> s = studentRepo.findById(id);
		if (s.isPresent()) {
			Student rec = s.get();
			return rec;
		} else {
			System.out.println("record not found");
		}
		return null;
		
	}
	@GetMapping("/allstudents")
	public List<Student> showallrecord() {
		
		List<Student> students = studentRepo.findAll();
		return students;
	}
	@DeleteMapping("/delstudent/{id}")
	public String delRecord(@PathVariable("id") int id) {
		
		studentRepo.deleteById(id);
		
		return "record deleted";
	}
	@PostMapping("/insertrecord")
	public String insertRecord(@RequestBody Student stu) {
		
		studentRepo.save(stu);
		return stu.getName() + "..."+ stu.getAddress() +"..." + stu.getRegno() +" saved";
	}

}
