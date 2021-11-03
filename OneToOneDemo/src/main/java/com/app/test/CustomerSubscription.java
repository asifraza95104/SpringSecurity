package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.entity.Subscription;
import com.app.service.ICustomerService;
import com.app.service.ISubscriptionService;

public class CustomerSubscription {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		
		ISubscriptionService subService = 
				     (ISubscriptionService)context.getBean("subscriptionServiceImp");
		
		Subscription sub = new Subscription("Beginer", 1200.0, "this is subscription for c++");
		
		ICustomerService cs=(ICustomerService)context.getBean("customerServiceImpl");
		
		Customer cs1= cs.getCustomerById(1);
		cs1.setSubscription(sub);
		
		cs.saveCustomer(cs1);
		
		System.out.println("Done!!!");
		
		
	}
}
 