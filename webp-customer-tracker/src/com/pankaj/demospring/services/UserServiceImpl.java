package com.pankaj.demospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.demospring.DAO.UserDAO;
import com.pankaj.demospring.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public User getuser(int userId) {
		// TODO Auto-generated method stub
	User theUser = userDAO.getUser(userId);
		return theUser;
	}

	@Override
	@Transactional
	public void saveUser(User theUser) {
		// TODO Auto-generated method stub
		userDAO.saveUser(theUser);

	}

	@Override
	@Transactional
	public boolean verify(String theUsername, String thePassword) {
		// TODO Auto-generated method stub
		
		
		return userDAO.verify(theUsername, thePassword );
	}

}
