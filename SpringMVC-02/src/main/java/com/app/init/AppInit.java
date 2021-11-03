package com.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.config.AppConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override // AppConfig details
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override // URL-Patterns
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
