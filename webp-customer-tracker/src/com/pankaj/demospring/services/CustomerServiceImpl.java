package com.pankaj.demospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.demospring.DAO.CustomerDAO;
import com.pankaj.demospring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
		
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
		
	}
	@Override
	@Transactional
	public Customer getcustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(theId);
	}
	@Override
	@Transactional
	public void deleteCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theCustomer);
		
	}
	

}
