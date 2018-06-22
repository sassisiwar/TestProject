package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.business.ProjectBusiness;
import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;


@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired 
	ProjectBusiness projectBusiness;
	
	/* to save */
	@PostMapping("/save")
	public Project createProject(@Valid @RequestBody Project p) {
		
		return projectBusiness.save(p);
	}
	
	/* to get all projects*/
	@GetMapping("/")
	public List<Project> getAll(){
		return projectBusiness.findAll();
	}
	
	/* to find trainees by project */
	@GetMapping("/{id_project}")
	public List<Trainee> getTraineesByProject(@PathVariable(value="id_project") int id){
		return projectBusiness.findTrainnes(id);
	}
	
	

}
