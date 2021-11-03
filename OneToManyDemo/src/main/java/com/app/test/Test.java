package com.app.test;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.app.config.AppConfig;
import com.app.entity.AccountEntity;
import com.app.entity.EmployeeEntity;

public class Test {

	 public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext context = 
				 new AnnotationConfigApplicationContext(AppConfig.class);
		
		  HibernateTemplate hibernateTemplate = (HibernateTemplate)
		  context.getBean("htObj");
		 	 
		 
		/*
		 * LocalSessionFactoryBean sfbean =
		 * (LocalSessionFactoryBean)context.getBean("sfObj");
		 */ 
		 AccountEntity accountEntity1= new AccountEntity();
		 accountEntity1.setAccountNumber("account number-1");
		 
		 AccountEntity  accountEntity2= new AccountEntity();
		 accountEntity2.setAccountNumber("account number-2");
		 
		 
		 AccountEntity accountEntity3 = new AccountEntity();
		 accountEntity3.setAccountNumber("account number-3");
		 
		 
		 //adding Employee details 
		 
		 EmployeeEntity employeeEntity1 = new EmployeeEntity();
		 employeeEntity1.setFirstName("asif");
		 employeeEntity1.setLastName("raza");
		 employeeEntity1.setEmail("asifraza2099@gmail.com");
		 
		 Set<AccountEntity>  accountsOffFirstEmployee = 
				   new HashSet<AccountEntity>();
		 
		 accountsOffFirstEmployee.add(accountEntity2);
		 accountsOffFirstEmployee.add(accountEntity3);
		 accountsOffFirstEmployee.add(accountEntity1);
		 
		 employeeEntity1.setAccounts(accountsOffFirstEmployee);
		 
		hibernateTemplate.save(employeeEntity1);
		
		System.out.println("Done!!");
		 
	}
}
