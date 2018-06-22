package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Role;

import com.letsstartcoding.springbootrestapiexample.repository.RoleRepository;

@Service
public class RoleDAO {
	
	@Autowired
	RoleRepository roleRepository;
	
	/*to save */
	
	public Role save(Role emp) {
		return roleRepository.save(emp);
	}
	
	
	/* search */
	
	public List<Role> findAll(){
		return roleRepository.findAll();
	}
	
	
	/*get a role by id*/
	public Role findOne(Long empid) {
		return roleRepository.findOne(empid);
	}
	
	
	/*delete */
	
	public void delete(Role emp) {
		roleRepository.delete(emp);
	}
	
	public Role findByRoleName(String roleName){
		return roleRepository.findByRoleName(roleName);
	}
	

}
