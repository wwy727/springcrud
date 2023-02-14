package com.example.restapi.Service;

import java.util.List;

import com.example.restapi.domain.Role;
import com.example.restapi.domain.User;


public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User>getUsers();
    public List<User> findAll();
	
	public User findById(Long theId);
	
	public void save(User theEmployee);
	
	public void deleteById(Long theId);

}
