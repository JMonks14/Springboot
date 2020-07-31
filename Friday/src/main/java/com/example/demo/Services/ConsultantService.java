package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Trainees;
import com.example.demo.Repos.TraineeRepo;

@Service
public class ConsultantService {
	
	@Autowired
	TraineeRepo repo;
	
	public List <Trainees> clientTrainees(String c) {
		return repo.findByClient(c);
	}
	
	public List <Trainees> techTrainees(String c) {
		return repo.findByTech(c);
	}
	
	public String newConsultant(Trainees t) {
		repo.save(t);
		return "record saved";
	}
	
	public List<Trainees> consultantsByMarks(int m) {
		return repo.findByMarksGreaterThanEqual(m);
	}
	
	public int maxsalary() {
		return repo.maxSalary();
	}
	
	public List<Trainees> maxsalaryclient(String client) {
		return repo.maxSalaryClient(client);
	}
	
	public List<Trainees> maxmarksclient(String client) {
		return repo.maxMarksClient(client);
	}
	
	public List<Trainees> belAvgSalclient(String client) {
		return repo.belAvgSalClient(client);
	}
	
	public int numbertechconsultants(String client, String tech) {
		return repo.numbertechconsultants(client, tech);
	}
	
	public List<String> listclients(){
		return repo.listClients();
	}
	
	public List<String> listtechs(){
		return repo.listTechs();
	}

}
