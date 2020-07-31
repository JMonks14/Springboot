package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Trainees;
import com.example.demo.Services.ConsultantService;

@CrossOrigin
@RestController
public class TraineeController {
	
	
	@Autowired
	ConsultantService service;
	
	
	@GetMapping("/clientconsultants/{client}")
	public List<Trainees> consultantList1(@PathVariable("client") String client) {
		return service.clientTrainees(client);
	}
	
	@GetMapping("/techconsultants/{tech}")
	public List<Trainees> consultantList2(@PathVariable("tech") String tech) {
		return service.techTrainees(tech);
	}
	
	@PostMapping("/newconsultant")
	public String newConsultant(@RequestBody Trainees trainee) {
		return service.newConsultant(trainee);
	}
	@GetMapping("/consultantsmarks/{m}")
	public List<Trainees> consultansMarks(@PathVariable("m") int m) {
		return service.consultantsByMarks(m);
	}
	
	@GetMapping("/maxsalary")
	public int maxsalary() {
		return service.maxsalary();
	}
	
	@GetMapping("/maxsalary/{client}")
	public List<Trainees> maxsalaryclient(@PathVariable("client") String client) {
		return service.maxsalaryclient(client);
	}
	
	@GetMapping("/maxmarks/{client}")
	public List<Trainees> maxmarksclient(@PathVariable("client") String client) {
		return service.maxmarksclient(client);
	}
	
	@GetMapping("/belavgsalary/{client}")
	public List<Trainees> belAvgSalclient(@PathVariable("client") String client) {
		return service.belAvgSalclient(client);
	}
	
	@GetMapping("/numbertechconsultants/{client}/{tech}")
	public int numbertechconsultants(@PathVariable("client") String client,@PathVariable("tech") String tech) {
		return service.numbertechconsultants(client, tech);
	}
	
	@GetMapping("/listofclients")
	public List<String> listClients() {
		return service.listclients();
	}
	
	@GetMapping("/listoftechs")
	public List<String> listTechs() {
		return service.listtechs();
	}

}
