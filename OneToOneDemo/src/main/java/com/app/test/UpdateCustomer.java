package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.service.ICustomerService;
import com.app.service.ISubscriptionService;

public class UpdateCustomer {

	 public static void main(String[] args) {
		

			AnnotationConfigApplicationContext context = 
					new AnnotationConfigApplicationContext(AppConfig.class);

			ISubscriptionService subscriptionService = 
					(ISubscriptionService) context.getBean("subscriptionServiceImp");

			ICustomerService customerService =
					(ICustomerService) context.getBean("customerServiceImpl");

			Customer tempCustomer = customerService.getCustomerById(1);
			
			tempCustomer.setEmail("sirdra299@gmail.com");
			//tempCustomer.setId(1);
			customerService.saveCustomer(tempCustomer);
			
			System.out.println("record updated successfully!!!");
			
			
			
	}
}
