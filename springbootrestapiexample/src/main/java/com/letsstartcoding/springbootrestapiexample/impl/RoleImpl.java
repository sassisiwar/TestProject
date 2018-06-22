package com.letsstartcoding.springbootrestapiexample.impl;

import com.letsstartcoding.springbootrestapiexample.model.Role;

public interface RoleImpl {
	public Role save(Role r);
	public Role findByRoleName(String roleName);
	
}
