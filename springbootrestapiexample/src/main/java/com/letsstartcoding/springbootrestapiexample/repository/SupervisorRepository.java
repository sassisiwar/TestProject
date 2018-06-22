package com.letsstartcoding.springbootrestapiexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
	Supervisor findById(int id);
	
	@Query("SELECT t FROM Trainee t where t.supervisor = :supervisor")
	List<Trainee> findListOfTrainee(@Param("supervisor") Supervisor supervisor);
}
