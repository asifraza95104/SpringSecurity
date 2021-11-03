package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.service.ICustomerService;

public class MyTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		ICustomerService cs=(ICustomerService)context.getBean("customerServiceImpl");
		
		Customer  customer = 
				new Customer("asif", "raza", "asifraza@gmail.com");
		
		int count = cs.saveCustomer(customer);
		System.out.println("customer onbject saved successfully");
	}
	
}
