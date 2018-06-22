package com.letsstartcoding.springbootrestapiexample.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.dao.ProjectDAO;
import com.letsstartcoding.springbootrestapiexample.impl.ProjectImpl;
import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

@Service
public class ProjectBusiness implements ProjectImpl{
	@Autowired
	ProjectDAO projectDAO;

	@Override
	public Project save(Project p) {
		// TODO Auto-generated method stub
		return projectDAO.save(p);
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return projectDAO.getAllProjects();
	}

	@Override
	public List<Trainee> findTrainnes(int p) {
		// TODO Auto-generated method stub
		Project project=projectDAO.findById(p);
		
		return projectDAO.findTrainnes(project);
	}

	@Override
	public List<Supervisor> findSupervisors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findById(int id) {
		// TODO Auto-generated method stub
		return projectDAO.findById(id);
	}
	

}
