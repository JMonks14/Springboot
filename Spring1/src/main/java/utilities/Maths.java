package utilities;

import org.springframework.stereotype.Component;

@Component
public class Maths {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public float salaryAfterTax(int salary) {
		return ((float) salary)*0.8f;
	}

}
