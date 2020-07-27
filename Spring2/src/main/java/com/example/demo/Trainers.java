package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trainers {
	
	@RequestMapping(value="/trainer/someguy")
	public String someguy( ) {
		return "A trainer guy";
	}

}
