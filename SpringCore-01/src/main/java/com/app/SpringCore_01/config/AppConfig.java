package com.app.SpringCore_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.SpringCore_01.bean.Employee;

@Configuration
public class AppConfig {

	    @Bean
	   public Employee empObj()
	   {
		   Employee employee = new Employee();
		   employee.setEmpId(10);
		   employee.setEmpName("Asif");
		   return employee;
	   }
}
