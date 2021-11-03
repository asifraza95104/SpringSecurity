package com.app.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.entity.Customer;
import com.app.service.CustomerServiceImpl;
import com.app.service.ICustomerService;
import com.app.service.ISubscriptionService;

public class DeleteSubscription {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ISubscriptionService subscriptionService = (ISubscriptionService) context.getBean("subscriptionServiceImp");

		ICustomerService customerService = (ICustomerService) context.getBean("customerServiceImpl");

		/*
		 * List<Customer> customer_list = customerService.getAllCutomer();
		 * 
		 * // System.out.println(customer_list);
		 * 
		 * Iterator<Customer> customer_iterator = customer_list.iterator(); while
		 * (customer_iterator.hasNext()) { System.out.println(customer_iterator.next());
		 * }
		 */

		/*
		 * customerService.deleteCustomer(4);
		 * System.out.println("Customer deleted successfully!!");
		 */
		
		
		subscriptionService.deleteSubscription(4);
		System.out.println("subscription  deleted successfully!!");
		

	}

}
