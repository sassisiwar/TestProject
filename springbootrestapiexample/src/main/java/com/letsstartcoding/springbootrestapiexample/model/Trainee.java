package com.letsstartcoding.springbootrestapiexample.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Trainee")
@EntityListeners(AuditingEntityListener.class)
public class Trainee extends Person{
	
	@ManyToOne
	private Project project;
	
	@ManyToOne
	private Supervisor supervisor;
	
	@OneToMany(mappedBy="trainee")
	private List<Task> tasks;
	
	
	public Trainee(){
		super();
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	public Supervisor getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}


	public List<Task> getTasks() {
		return tasks;
	}


	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	} 

}
