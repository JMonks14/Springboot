package com.example.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Trainees;

@Repository
public interface TraineeRepo extends JpaRepository<Trainees,Integer>{
	
	public List<Trainees> findByTech(String tech);
	public List<Trainees> findByClient(String client);
	public List<Trainees> findByMarksGreaterThanEqual(int M);
//	public List<Trainees> 
	
	@Query(value="Select max(salary) from consultant", nativeQuery=true)
	public int maxSalary();
	
	@Query(value="Select * from consultant where salary = (select max(salary) from consultant where client =?1) and client=?1", nativeQuery=true)
	public List<Trainees> maxSalaryClient (String c);
	
	@Query(value="Select count(*) from consultant where client=?1 and tech=?2",nativeQuery=true)
	public int numbertechconsultants(String client, String tech);
	
	@Query(value="Select distinct client from consultant",nativeQuery=true)
	public List<String> listClients();
	
	@Query(value="Select distinct tech from consultant",nativeQuery=true)
	public List<String> listTechs();
	
	@Query(value="Select * from consultant where marks = (select max(marks) from consultant where client =?1) and client=?1", nativeQuery=true)
	public List<Trainees> maxMarksClient (String c);
	
	@Query(value="Select * from consultant where salary < (select avg(salary) from consultant where client =?1) and client=?1", nativeQuery=true)
	public List<Trainees> belAvgSalClient (String c);

}
