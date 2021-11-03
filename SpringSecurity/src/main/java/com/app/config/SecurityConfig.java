package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.util.AntPathMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	
	    @Autowired
	  private BCryptPasswordEncoder pwdEncoder;
	    
	    
	    
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception
	    {
	    	   auth.inMemoryAuthentication().withUser("Sam")
	    	   .password(pwdEncoder.encode("Sam"))
	    	   .authorities("EMP");
	    	   
	    	   
	    	   auth.inMemoryAuthentication().withUser("Ram")
	    	   .password(pwdEncoder.encode("Ram"))
	    	   .authorities("ADMIN");
	    	   
	    	   auth.inMemoryAuthentication().withUser("Vicky")
	    	   .password(pwdEncoder.encode("Vicky"))
	    	   .authorities("STUDENT", "MGR");
	    }
	    
	    protected void configure(HttpSecurity http) throws Exception 
	    {
	        http.authorizeRequests()
	        .antMatchers("/all").permitAll()
	        .antMatchers("/emp").hasAuthority("EMP")
	        .antMatchers("/admin").hasAuthority("ADMIN")
	        .anyRequest().authenticated()
	        .and().formLogin().defaultSuccessUrl("/view")
	        .and().logout().logoutRequestMatcher((RequestMatcher) new AntPathMatcher("/logout"))
	        .and().exceptionHandling().accessDeniedPage("/denied");
	        
	    	     
	    }
	  
	    
	    
	    
	    
	    
}
