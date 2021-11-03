package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.entity.Subscription;
import com.app.service.ICustomerService;
import com.app.service.ISubscriptionService;

public class CreateNewCustomerWithSubscription {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				 new AnnotationConfigApplicationContext(AppConfig.class);
		ISubscriptionService subService = 
			     (ISubscriptionService)context.getBean("subscriptionServiceImp");
		
		ICustomerService custService =
				(ICustomerService)context.getBean("customerServiceImpl");
		
		Subscription sub1 = new Subscription("sub1", 1000.0, "c++");
		Customer cust1= new Customer("asif", "raza", "asifraza@gmail.com");
		sub1.setCustomer(cust1);
		
		subService.saveSubscription(sub1);
		custService.saveCustomer(cust1);
		
		 System.out.println("Data Successfully saved!!!");
		
		
		
	}
}
