package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Customer;
import com.app.repositories.ICustomer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	 @Autowired
	private ICustomer cdao;
	
	@Transactional
	public void saveCustomer(Customer customer) {
		
		  cdao.saveCutomer(customer);
		
	}

	 @Transactional
	public void updateCustomer(Customer customer) {
		
		cdao.updateCustomer(customer);
		
	}
      
	 @Transactional
	public void deleteCustomer(int id) {
		cdao.deleteCustomer(id);
		
	}

	  
	 @Transactional(readOnly = true)
	public Customer getCustomerById(int id) {
	 return  cdao.getCustomerById(id);
	}

	   @Transactional(readOnly = true)
	public List<Customer> getAllCutomer() {
		
		return cdao.getAllCustomer();
	}

}
