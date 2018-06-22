package com.letsstartcoding.springbootrestapiexample.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.dao.PersonDAO;
import com.letsstartcoding.springbootrestapiexample.impl.PersonImpl;
import com.letsstartcoding.springbootrestapiexample.model.Person;


@Service
public class PersonBusiness implements PersonImpl{
	
	@Autowired
	PersonDAO personDAO;
	public List<Person> findAll(){
		return personDAO.findAll();
		
	}
	
	public Person save(Person emp){
		
		return personDAO.save(emp);
		
	}
	
	

}
