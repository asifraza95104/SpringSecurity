package com.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.config.AppConfig;

public class AppInit  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		//return new Class[] {SecurityConfig.class};
				return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
		
		
		
	}

	
	 
}
