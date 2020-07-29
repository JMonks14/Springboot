package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import utilities.Maths;
@RestController
public class control1 {
//	@Autowired

	
	@RequestMapping(value="/")
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
	
//	@RequestMapping(value="tax/{salary}", method=RequestMethod.GET)
//	public float teamMsg(@PathVariable int salary) {
//		return maths.salaryAfterTax(salary);
//	}
	
}
