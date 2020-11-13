package com.pankaj.demospring.DAO;

import java.util.List;

import com.pankaj.demospring.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(Customer theCustomer);

	

}
