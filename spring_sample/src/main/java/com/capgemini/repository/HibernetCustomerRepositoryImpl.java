package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class HibernetCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.capgemini.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers =new ArrayList<Customer>();
		
		Customer customer =new Customer();
		
		customer.setFirstName("Kappala");
		customer.setLastName("Rajendra");
		
		customers.add(customer);
		
		return customers;
	}
}
