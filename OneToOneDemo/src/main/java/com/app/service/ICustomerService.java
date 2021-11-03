package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface ICustomerService {

	   public void saveCustomer(Customer customer);
	   public void updateCustomer(Customer customer);
	   public void deleteCustomer(int id);
	   public Customer getCustomerById(int id);
	   public List<Customer> getAllCutomer();
}
