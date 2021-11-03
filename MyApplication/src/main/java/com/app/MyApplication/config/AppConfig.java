package com.app.MyApplication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class AppConfig {

	  @Autowired
	private Environment env;
	
	      @Bean
	     public DriverManagerDataSource driverManagerDataSource()
	     {
	    	   DriverManagerDataSource driverManagerDataSource=
	    			   new DriverManagerDataSource();
	    driverManagerDataSource.setDriverClassName(env.getProperty("dc"));
	    driverManagerDataSource.setUrl(env.getProperty("url"));
	    driverManagerDataSource.setUsername(env.getProperty("un"));
	    driverManagerDataSource.setPassword(env.getProperty("pwd"));
	    return driverManagerDataSource;
	     }
	    
	      @Bean
	     public JdbcTemplate  jdbcTemplate()
	     {
	    	  JdbcTemplate  jdbcTemplate= new JdbcTemplate();
	    	  jdbcTemplate.setDataSource(driverManagerDataSource());
	    	  return jdbcTemplate;
	    	  
	     }
	
}
