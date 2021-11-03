package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app")
public class AppConfig {

	  @Bean
	 public InternalResourceViewResolver  internalResourceViewResolver()
	 {
		  
		 InternalResourceViewResolver internalResourceViewResolver
		 = new InternalResourceViewResolver();
		 internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		 internalResourceViewResolver.setSuffix(".jsp");
		 return internalResourceViewResolver;
	 }
	
	
}
