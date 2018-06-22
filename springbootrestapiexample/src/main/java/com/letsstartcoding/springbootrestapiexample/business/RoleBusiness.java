package com.letsstartcoding.springbootrestapiexample.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.dao.RoleDAO;
import com.letsstartcoding.springbootrestapiexample.impl.RoleImpl;
import com.letsstartcoding.springbootrestapiexample.model.Role;

@Service
public class RoleBusiness implements RoleImpl{
	
	
	@Autowired
	RoleDAO roleDAO;
	
	@Override
	public Role save(Role r) {
		// TODO Auto-generated method stub
		return roleDAO.save(r);
	}

	@Override
	public Role findByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleDAO.findByRoleName(roleName);
	}

}
