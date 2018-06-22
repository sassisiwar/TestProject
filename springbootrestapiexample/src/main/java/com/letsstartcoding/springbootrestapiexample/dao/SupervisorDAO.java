package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;
import com.letsstartcoding.springbootrestapiexample.repository.SupervisorRepository;

@Service
public class SupervisorDAO {
	
	@Autowired
	SupervisorRepository sup;
	
	/*to save*/
	public Supervisor save(Supervisor s){
		
		return sup.save(s);
	}

	/* find by id */
	public Supervisor findById(int id){
		return sup.findById(id);
	}
	
	/* find list of trainee */
	public List<Trainee> findList(Supervisor s){
		return sup.findListOfTrainee(s);
	}
	
	
	
	
	
}
