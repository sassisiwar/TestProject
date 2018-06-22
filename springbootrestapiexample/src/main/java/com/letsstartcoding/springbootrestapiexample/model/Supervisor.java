package com.letsstartcoding.springbootrestapiexample.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Supervisor")
@EntityListeners(AuditingEntityListener.class)
public class Supervisor extends Person{
	
	/*@OneToMany(mappedBy="supervisor")
	private List<Trainee> trainees;*/
	
	public Supervisor(){
		super();

}

	
	
	
}