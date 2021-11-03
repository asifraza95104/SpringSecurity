package com.app.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.app.bean.Student;

@Configuration
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.app"})
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
		 return  driverManagerDataSource;
	}
	  
	  
	  public Properties props()
	  {
		     Properties properties = new Properties();
		     properties.put("hibernate.dialect", env.getProperty("dialect"));
             properties.put("hibernate.show_sql", env.getProperty("showsql"));
             properties.put("hibernate.format_sql", env.getProperty("fmtsql"));
             properties.put("hibernate.hbm2ddl.auto", env.getProperty("ddlauto"));
             
             return properties;
 
	  }
	  
	
	   @Bean
	 public LocalSessionFactoryBean sessionFactory()
	 {
		  LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		  sfb.setDataSource(driverManagerDataSource());
		  sfb.setHibernateProperties(props());
		  sfb.setAnnotatedClasses(Student.class);
		  return sfb;
		  
	 }
	  
	    @Bean
	   public HibernateTemplate hibernateTemplate()
	   {
		      HibernateTemplate hibernateTemplate= 
		    		  new HibernateTemplate();
		      hibernateTemplate.setSessionFactory(sessionFactory().getObject());
		      return hibernateTemplate;
	   }
	  
	    
	    @Bean
	    public HibernateTransactionManager hibernateTransactionManager()
	    {
	    	 HibernateTransactionManager hibernateTransactionManager= 
	    			 new HibernateTransactionManager();
	    	 hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
	    	 return hibernateTransactionManager;
	    }
	  
}
