package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.Model.Sale;
import com.example.demo.Repositories.SalesRepo;


@Service
@CrossOrigin
public class SaleService {
	
	@Autowired
	SalesRepo salesRepo;
	
	public void storeRecord(Sale sale) {
		salesRepo.save(sale);
		
	}
	
	public String delRecord(int sid) {
				
		if (salesRepo.existsById(sid)) {
			salesRepo.deleteById(sid);
			return "record deleted";
		} else {
			return "record " + sid + " does not exist";
		}
				
	}
	
	public List<Sale> allSales() {
		List<Sale> sales = salesRepo.findAll();
		return sales;
	}
	

}
