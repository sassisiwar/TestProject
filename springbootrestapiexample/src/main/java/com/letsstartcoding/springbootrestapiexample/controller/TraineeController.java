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

import com.letsstartcoding.springbootrestapiexample.business.RoleBusiness;
import com.letsstartcoding.springbootrestapiexample.business.SupervisorBusiness;
import com.letsstartcoding.springbootrestapiexample.business.TraineeBusiness;
import com.letsstartcoding.springbootrestapiexample.dao.SupervisorDAO;
import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Role;
import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeBusiness traineeB;
	@Autowired
	RoleBusiness roleB;
	@Autowired
	SupervisorDAO supervisorDAO;
	
	/* to save a role*/
	@PostMapping("/save")
	public Trainee createTrainee(@Valid @RequestBody Trainee s) {
		return traineeB.save(s);
	}
	
	/* find all trainees */
	
	@GetMapping("/all")
	public List<Trainee> findAll(){
		return traineeB.findAll();
	}
	
	/* to affect on a project */
	
	@GetMapping("/affect/{id_trainne}/{id_project}")
	public Trainee AffectTraineeOnProject(@PathVariable(value="id_trainne") int t,@PathVariable(value="id_project") int p) {
		return traineeB.affectOnProject(t, p);
	}
	
/* to affect a supervisor */
	
	@GetMapping("/affectsupervisor/{id_trainne}/{id_supervisor}")
	public Trainee AffectSupervisor(@PathVariable(value="id_trainne") int t,@PathVariable(value="id_supervisor") int s) {
		return traineeB.affectSupervisor(t, s);
	}
		
	

}
