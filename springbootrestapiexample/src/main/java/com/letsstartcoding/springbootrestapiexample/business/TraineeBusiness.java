package com.letsstartcoding.springbootrestapiexample.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.dao.ProjectDAO;
import com.letsstartcoding.springbootrestapiexample.dao.RoleDAO;
import com.letsstartcoding.springbootrestapiexample.dao.SupervisorDAO;
import com.letsstartcoding.springbootrestapiexample.dao.TraineeDAO;
import com.letsstartcoding.springbootrestapiexample.impl.TraineeImpl;
import com.letsstartcoding.springbootrestapiexample.model.Project;
import com.letsstartcoding.springbootrestapiexample.model.Role;
import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

@Service
public class TraineeBusiness implements TraineeImpl{
	@Autowired
	TraineeDAO traineeDAO;
	
	@Autowired
	ProjectDAO projectDAO;
	
	@Autowired
	RoleDAO roleDAO;
	
	@Autowired
	SupervisorDAO supervisorDAO;

	@Override
	public Trainee save(Trainee t) {
		// TODO Auto-generated method stub
		Role r=roleDAO.findByRoleName("trainee");
		List<Role> l=t.getRoles();
		Boolean verif=l.add(r);
		t.setRoles(l);
		//t.setSupervisor(supervisorDAO.findById(id_sup));
		return traineeDAO.save(t);
	}

	@Override
	public List<Trainee> findAll() {
		// TODO Auto-generated method stub
		return traineeDAO.findAll();
	}

	@Override
	public Trainee affectOnProject(int id_trainee,int id_project) {
		// TODO Auto-generated method stub
		Project project=projectDAO.findById(id_project);
		Trainee trainee=traineeDAO.findById(id_trainee);
		trainee.setProject(project);
		return traineeDAO.save(trainee);
		
	}

	@Override
	public Trainee findById(int id) {
		// TODO Auto-generated method stub
		return traineeDAO.findById(id);
	}

	@Override
	public Trainee affectSupervisor(int id_trainee, int id_supervisor) {
		// TODO Auto-generated method stub
		Trainee trainee=traineeDAO.findById(id_trainee);
		Supervisor supervisor =supervisorDAO.findById(id_supervisor);
		trainee.setSupervisor(supervisor);
		return traineeDAO.save(trainee);
	}
	

}
