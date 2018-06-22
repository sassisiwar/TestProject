package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.business.PersonBusiness;
import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.dao.PersonDAO;
import com.letsstartcoding.springbootrestapiexample.model.Employee;
import com.letsstartcoding.springbootrestapiexample.model.Person;

import net.minidev.json.annotate.JsonIgnore;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonBusiness personB;
	
	/* to save a person*/
	@PostMapping("/save")
	public Person createEmployee(@Valid @RequestBody Person emp) {
		return personB.save(emp);
	}
	
	/*get all employees*/
	
	@GetMapping("/")
	public List<Person> getAllEmployees(){
		return personB.findAll();
	}

}
