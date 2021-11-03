package com.app.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerImpl implements ICustomer {

	   @Autowired
	private HibernateTemplate hibernateTemplate;
	
	   
	public void  saveCutomer(Customer customer) {
	   hibernateTemplate.saveOrUpdate(customer);
		
	}

	public void updateCustomer(Customer customer) {
		hibernateTemplate.update(customer);
		
	}

	public void deleteCustomer(int id) {
		hibernateTemplate.delete(new Customer(id));
		
	}

	public Customer getCustomerById(int id) {
		
		return hibernateTemplate.get(Customer.class, id);
	}

	public List<Customer> getAllCustomer() {
		
		return hibernateTemplate.loadAll(Customer.class);
	}

}
