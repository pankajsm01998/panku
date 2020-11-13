package com.pankaj.demospring.services;

import java.util.List;

import com.pankaj.demospring.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getcustomer(int theId);

	public void deleteCustomer(Customer theCustomer);


}
