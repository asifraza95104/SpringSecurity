package com.app.config;

import java.util.Properties;

import javax.sql.DataSource;

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

import com.app.entity.Customer;
import com.app.entity.Subscription;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan(basePackages = {"com.app"})
@EnableTransactionManagement
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource()
	{
		  DriverManagerDataSource dsObj=
				   new DriverManagerDataSource();
		  dsObj.setDriverClassName(env.getProperty("dc"));
		  dsObj.setUrl(env.getProperty("url"));
		  dsObj.setUsername(env.getProperty("un"));
		  dsObj.setPassword(env.getProperty("pwd"));
		  return dsObj;
	}
	
	
	public Properties  props()
	{
		 Properties  properties= new Properties();
		 properties.put("hibernate.dialect", env.getProperty("dialect"));
		 properties.put("hibernate.show_sql", env.getProperty("showsql"));
		 properties.put("hibernate.format_sql",env.getProperty("fmtsql"));
		 properties.put("hibernate.hbm2ddl.auto", env.getProperty("ddlauto"));
		 return properties;
		 
		 
	}
	
	@Bean
	public LocalSessionFactoryBean sfObj()
	{
		LocalSessionFactoryBean sf= 
				new LocalSessionFactoryBean();
		 sf.setDataSource(dataSource());
		 sf.setHibernateProperties(props());
		 sf.setAnnotatedClasses(Customer.class, Subscription.class);
		 return sf;
		 
	}

	 @Bean
	public HibernateTransactionManager httObj()
	{
		  HibernateTransactionManager htm = 
				   new HibernateTransactionManager();
		  htm.setSessionFactory(sfObj().getObject());
		  return htm;
	}
	 
	 @Bean
	 public HibernateTemplate htObj()
	 {
		 HibernateTemplate ht= new HibernateTemplate();
		 ht.setSessionFactory(sfObj().getObject());
		 return ht;
	 }
	 
}
