package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Sale;


@Repository
public interface SalesRepo extends JpaRepository<Sale, Integer>{
	
	@Query(Value = "Select max(quantity) from Tesco", nativeQuery=true)
	public int maxMarks

}
