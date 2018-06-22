package com.letsstartcoding.springbootrestapiexample.impl;

import java.util.List;

import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

public interface ProjectImpl {
	
	Project save(Project p);
	List<Project> findAll();
	List<Trainee> findTrainnes(int id_project);
	List<Supervisor> findSupervisors();
	Project findById(int id);
	

}
