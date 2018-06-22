package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Person;
import com.letsstartcoding.springbootrestapiexample.model.Role;
import com.letsstartcoding.springbootrestapiexample.repository.PersonRepository;
import com.letsstartcoding.springbootrestapiexample.repository.RoleRepository;

@Service
public class PersonDAO {
	
	@Autowired
	PersonRepository personRepository;
	
	/*to save */
	
	public Person save(Person emp) {
		return personRepository.save(emp);
	}
	
	
	/* search */
	
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	
	
	/*get a role by id*/
	public Person findOne(Long empid) {
		return personRepository.findOne(empid);
	}
	
	
	/*delete */
	
	public void delete(Person emp) {
		personRepository.delete(emp);
	}
	

}
