package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import utilities.Maths;

@RestController
@CrossOrigin
@RequestMapping(value="Maths/")
public class MathsControl {
	@Autowired
	Maths ref;
	@GetMapping(value="{op}/{a}/{b}")
	public String calc(@PathVariable String op, @PathVariable int a, @PathVariable int b) {
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
