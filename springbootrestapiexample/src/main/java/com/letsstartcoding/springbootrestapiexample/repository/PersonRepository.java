package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springbootrestapiexample.model.Person;
import com.letsstartcoding.springbootrestapiexample.model.Role;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
