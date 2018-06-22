package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;
import com.letsstartcoding.springbootrestapiexample.repository.ProjectRepository;

@Service
public class ProjectDAO {
	@Autowired
	ProjectRepository projectRepository;
	
	/* to save a project*/
	public Project save(Project p){
		return projectRepository.save(p);
	}
	
	/*to get all projects*/
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	}
	
	/* to find by id */
	
	public Project findById(int id){
		return projectRepository.findById(id);
	}
	
	/* to find trainees by project*/
	
	public List<Trainee> findTrainnes(Project p){
		return projectRepository.findTrainnes(p);
	}

}
