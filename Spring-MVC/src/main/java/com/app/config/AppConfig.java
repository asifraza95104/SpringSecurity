package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.app"})
public class AppConfig {
 
	  @Bean
	public InternalResourceViewResolver internalResourceViewResolver()
	{
		
		InternalResourceViewResolver irvr= 
				new InternalResourceViewResolver();
		
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setViewClass(JstlView.class);
		irvr.setViewNames("helloworld");
		irvr.setSuffix(".jsp");
		
		
		return irvr;
	}
	
	
	
}
