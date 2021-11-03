package com.app.SpringCore_01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.SpringCore_01.bean.Employee;
import com.app.SpringCore_01.config.AppConfig;

public class Test {
	
	    public static void main(String[] args) {
			 
	    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	    	
	    	
	    	Employee employee = (Employee) ac.getBean("empObj");
	    	
	    	 System.out.println(employee);
		}
}
