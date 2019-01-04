package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;

@Repository("customerRepository")
public class HibernetCustomerRepositoryImpl implements CustomerRepository {
	
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
