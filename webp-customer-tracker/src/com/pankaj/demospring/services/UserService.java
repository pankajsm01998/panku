package com.pankaj.demospring.services;

import com.pankaj.demospring.entity.User;

public interface UserService {
	
	public User getuser(int userId);
	
	public void saveUser(User theUser);
	
	public boolean verify(String theUsername, String thePassword);
	

}
