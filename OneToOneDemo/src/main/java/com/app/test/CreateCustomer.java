package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.service.ICustomerService;

public class CreateCustomer {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  context = 
				 new AnnotationConfigApplicationContext(AppConfig.class);
		
		ICustomerService customerService = 
				(ICustomerService) context.getBean("customerServiceImpl");
		
		Customer  tempCustomer= new Customer("Asif", "Raza", "asifraza2099@gmail.com");
		
		customerService.saveCustomer(tempCustomer);
		
		System.out.println("New Customer successfully saved !!!");
		
		
	}
	
}
