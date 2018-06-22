package com.letsstartcoding.springbootrestapiexample.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.dao.RoleDAO;
import com.letsstartcoding.springbootrestapiexample.dao.SupervisorDAO;
import com.letsstartcoding.springbootrestapiexample.impl.SupervisorImpl;
import com.letsstartcoding.springbootrestapiexample.model.Role;
import com.letsstartcoding.springbootrestapiexample.model.Supervisor;
import com.letsstartcoding.springbootrestapiexample.model.Trainee;

@Service
public class SupervisorBusiness implements SupervisorImpl{
	
	@Autowired
	SupervisorDAO supDAO;
	@Autowired
	RoleDAO roleDAO;

	@Override
	public Supervisor save(Supervisor s) {
		// TODO Auto-generated method stub
		Role r=roleDAO.findByRoleName("supervisor");
		List<Role> l=s.getRoles();
		Boolean verif=l.add(r);
		s.setRoles(l);
		return supDAO.save(s);
	}

	@Override
	public Supervisor findById(int id) {
		// TODO Auto-generated method stub
		return supDAO.findById(id);
	}

	@Override
	public List<Trainee> findList(Supervisor s) {
		// TODO Auto-generated method stub
		return supDAO.findList(s);
	}

}
