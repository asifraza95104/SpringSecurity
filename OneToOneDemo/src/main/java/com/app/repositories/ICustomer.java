package com.app.repositories;

import java.util.List;

import com.app.entity.Customer;

public interface ICustomer {

       public void saveCutomer(Customer customer);
       public void updateCustomer(Customer customer);
       public void deleteCustomer(int id);
       public Customer getCustomerById(int id);
       public List<Customer> getAllCustomer();
       
	
}
