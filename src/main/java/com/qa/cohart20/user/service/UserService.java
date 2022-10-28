package com.qa.cohart20.user.service;

import com.qa.cohart20.admin.Admin;
import com.qa.cohart20.user.User;
import com.qa.cohart20.user.repository.UserRepository;

public class UserService {
	
	public User validateUser(String username, String password) throws Exception {
		
		UserRepository userrepo=new UserRepository();
		User user=userrepo.validateUserCredentials(username, password);
		return user;
	}
	
public Admin validateAdmin(String username, String password) throws Exception { 
		 
		UserRepository userrepo=new UserRepository();
		Admin admin=userrepo.validateAdminCredentials(username, password);
		return admin;
	}
}
