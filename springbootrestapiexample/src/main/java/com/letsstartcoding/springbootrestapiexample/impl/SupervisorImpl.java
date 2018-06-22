package com.letsstartcoding.springbootrestapiexample.impl;

import java.util.List;

import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

public interface SupervisorImpl {
	public Supervisor save(Supervisor s);
	public Supervisor findById(int id);
	public List<Trainee> findList(Supervisor s);
}
