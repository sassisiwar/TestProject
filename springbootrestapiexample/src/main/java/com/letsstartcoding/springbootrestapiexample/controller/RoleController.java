package com.letsstartcoding.springbootrestapiexample.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.letsstartcoding.springbootrestapiexample.business.RoleBusiness;

import com.letsstartcoding.springbootrestapiexample.model.Role;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleBusiness roleB;
	
	/* to save a role*/
	@PostMapping("/save")
	public Role createRole(@Valid @RequestBody Role r) {
		return roleB.save(r);
	}
	
	@GetMapping("/find/{roleName}")
	public Role findByRoleName(@PathVariable("roleName") String name){
		return roleB.findByRoleName(name);
	}
	
	
}
