package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer>{
	
	
}
