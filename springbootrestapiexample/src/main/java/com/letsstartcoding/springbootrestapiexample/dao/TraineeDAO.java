package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;
import com.letsstartcoding.springbootrestapiexample.repository.TraineeRepository;

@Service
public class TraineeDAO {
	@Autowired
	TraineeRepository traineeRep;
	
	/* to save a trainee*/
	
	public Trainee save(Trainee t){
		return traineeRep.save(t);
	}
	public List<Trainee> findAll(){
		return traineeRep.findAll();
	}
	
	
	
	public Trainee findById(int id){
		return traineeRep.findOne(id);
	}
}
