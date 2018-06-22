package com.letsstartcoding.springbootrestapiexample.impl;

import java.util.List;

import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

public interface TraineeImpl {
	public Trainee save(Trainee t);
	public List<Trainee> findAll();
	Trainee affectOnProject(int id_trainee,int id_project);
	Trainee affectSupervisor(int id_trainee,int id_supervisor);
	Trainee findById(int id);

}
