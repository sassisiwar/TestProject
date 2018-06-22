package com.letsstartcoding.springbootrestapiexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	Project findById(int id);
	@Query("SELECT t FROM Trainee t where t.project = :project")
	List<Trainee> findTrainnes(@Param("project") Project p );

}
