package com.app.config;

import java.util.Properties;

import javax.persistence.Basic;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "com.app")
public class AppConfig  implements WebMvcConfigurer{
      
	 @Autowired
	private Environment env;
	
	 //DataSource
	 
	 @Bean
	 public BasicDataSource dsObj()
	 {
		   BasicDataSource ds = 
				     new BasicDataSource();
		   ds.setDriverClassName(env.getProperty("dc"));
		   ds.setUrl(env.getProperty("url"));
		   ds.setUsername(env.getProperty("un"));
		   ds.setPassword(env.getProperty("pwd"));
		   ds.setInitialSize(1);
		   ds.setMaxIdle(10);
		   ds.setMinIdle(5);
		   ds.setMaxTotal(10);
		   return ds;
		   
	 }
	
	 private Properties props()
	 {
		 Properties p = new Properties();
		 p.put("hibernate.dialect", env.getProperty("dialect"));
		 p.put("hibernate.show_sql", env.getProperty("showsql"));
		 p.put("hibernate.format_sql", env.getProperty("fmtsql"));
		 p.put("hibernate.hbm2ddl.auto", env.getProperty("ddlauto"));
		 
		 return p;
		 
	 }
	
	 
	 //SessionFactory
	 
	 @Bean
	 public LocalSessionFactoryBean sfObj()
	 {
		  LocalSessionFactoryBean sf=
				   new LocalSessionFactoryBean();
		  sf.setDataSource(dsObj());
		  sf.setAnnotatedClasses(Emploee.class);
		  sf.setHibernateProperties(props());
		  return sf;
	 }
	 
	 //hibernate Templates 
	 
	 @Bean
	 public HibernateTemplate htObj()
	 {
		  HibernateTemplate ht= 
				   new HibernateTemplate();
		  ht.setSessionFactory(sfObj().getObject());
		  return ht;
	 }
	 
	 //Tx Manager
	 @Bean
	 public HibernateTransactionManager httx()
	 {
		 HibernateTransactionManager  htm= 
				 new HibernateTransactionManager();
		 htm.setSessionFactory(sfObj().getObject());
		 return htm;
	 }
	 
	 
	 
	 
}
