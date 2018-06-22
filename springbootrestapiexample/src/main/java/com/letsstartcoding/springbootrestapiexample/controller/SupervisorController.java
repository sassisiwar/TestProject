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
import com.letsstartcoding.springbootrestapiexample.model.Role;
import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

@RestController
@RequestMapping("/supervisor")
public class SupervisorController {
	@Autowired
	SupervisorBusiness supB;
	
	@Autowired
	RoleBusiness roleB;
	
	/* to save a supervisor*/
	@PostMapping("/save")
	public Supervisor createSupervisor(@Valid @RequestBody Supervisor s) {
		
		return supB.save(s);
	}
	
	/* to find list of trainee */
	@GetMapping("/listoftrainee/{id}")
	public List<Trainee> findList(@PathVariable(value="id") int id){
		return supB.findList(supB.findById(id));
	}

}
