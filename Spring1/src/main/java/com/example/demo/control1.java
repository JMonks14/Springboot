package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class control1 {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "welcome to the home page";
	}
	@RequestMapping(value="/Chelsea", method=RequestMethod.GET)
	public String chelsea() {
		return "Blue is the colour";
	}
	
	@RequestMapping(value="/Chelsea", method=RequestMethod.POST)
	public String chelsea2() {
		return "Blue is still the colour";
	}
	
	@RequestMapping(value="/Chelsea", method=RequestMethod.DELETE)
	public String chelsea3() {
		return "Blue is always the colour";
	}
	
	@RequestMapping(value="/Fulham")
	public String fulham() {
		return "Come on you whites";
	}
	
	@RequestMapping(value="msg/{team}", method=RequestMethod.GET)
	public String teamMsg(@PathVariable(value="team") String team) {
		return team + " are a good team";
		
	}
	
	@RequestMapping(value="maths/{op}/{a}/{b}", method=RequestMethod.GET)
	public String calc(@PathVariable(value="op") String op, @PathVariable(value="a") int a, @PathVariable(value="b") int b) {
		Maths ref = new Maths();
		switch (op) {
		case "add":
			return "the answer is " + ref.add(a, b);
		case "sub":
			return "the answer is " + ref.sub(a, b);
		case "mul":
			return "the answer is " + ref.mul(a, b);
		case "div":
			return "the answer is " + ref.div(a, b);
		default:
			return "invalid operation";
		}
	}
}
