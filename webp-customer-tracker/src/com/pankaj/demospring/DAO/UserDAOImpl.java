package com.pankaj.demospring.DAO;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pankaj.demospring.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUser(int userId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		User theUser = currentSession.get(User.class, userId);
		return theUser;
	}

	@Override
	public void saveUser(User theUser) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theUser);
		

	}

	@Override
	public boolean verify(String theUserName, String thePassword) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> theQuery = currentSession.createQuery("from User", User.class);
		List<User> theResult = theQuery.getResultList();
		boolean flag = false;
		for(int i=0;i<theResult.size();i++)
		{
			if(theResult.get(i).getUserName().equals(theUserName) && theResult.get(i).getPassword().equals(thePassword))
			{
				flag=true;
				break;
			}
		}
		return flag;
	}

}
