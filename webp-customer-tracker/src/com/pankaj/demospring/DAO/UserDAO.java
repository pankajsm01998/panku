package com.pankaj.demospring.DAO;

import com.pankaj.demospring.entity.User;

public interface UserDAO {
	
	public User getUser(int userId);
	
	public void saveUser(User theUser);
	
	public boolean verify(String theUserName, String thePassword);
	

}
