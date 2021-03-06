package com.example.demo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Sale;
import com.example.demo.Services.SaleService;

@RestController
@CrossOrigin
public class MyController {
	
	SaleService service;
	
	public MyController(SaleService service) {
		this.service = service;
	}
	
	@GetMapping("/deleterecord/{id}")
	public String delRecord(@PathVariable("id") int id) {
		String ret = service.delRecord(id);
		return ret;
	}
	
	@PostMapping("/addrecord") 
	public String addRecord(@RequestBody Sale sale) {
		service.storeRecord(sale);
		return "record added";		
	}
	
	@GetMapping("/showsales")
	public List<Sale> getSales() {
	return service.allSales();
	}

}
