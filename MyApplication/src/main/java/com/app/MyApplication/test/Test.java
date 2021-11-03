package com.app.MyApplication.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.MyApplication.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		 ApplicationContext applicationContext =
				 new AnnotationConfigApplicationContext(AppConfig.class);
		 JdbcTemplate jdbcTemplate =
				 (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		 String sql = "insert into student_table value(?,?,?,?,?)";
		 
		 
		 int count =jdbcTemplate.update(sql, 1,"farzana",250.0, 991234,"bara" );
		 
		  System.out.println("number of rows inserted :" +count);
		  	 
	}

}
