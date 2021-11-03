package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.entity.Subscription;
import com.app.service.ICustomerService;
import com.app.service.ISubscriptionService;

public class SubscriptionToCustomer {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ISubscriptionService subscriptionService = (ISubscriptionService) context.getBean("subscriptionServiceImp");

		ICustomerService customerService = (ICustomerService) context.getBean("customerServiceImpl");

		Subscription subscription = new Subscription("Dev", 15000.0, "DevOps for production management");
		
		 Customer  cust1= customerService.getCustomerById(4);
		
		 cust1.setSubscription(subscription);
		 cust1.setId(4);
		 customerService.saveCustomer(cust1);
		 
		 System.out.println("customer saved successfully!!!");
		 
		
	}
}
