package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	
	 @Autowired
	private BCryptPasswordEncoder encoder;
	
	 
	 @Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("KHAN").password(encoder.encode("KHAN")).authorities("STD");
			auth.inMemoryAuthentication().withUser("SAM").password(encoder.encode("SAM")).authorities("ADMIN");
			auth.inMemoryAuthentication().withUser("AJAY").password(encoder.encode("AJAY")).authorities("EMP");
		}
	 
	 
	 protected void configure(HttpSecurity http) throws Exception
	 {
		  http.authorizeRequests()
		  .antMatchers("/all").permitAll()
		  .antMatchers("/admin").hasAuthority("ADMIN")
		  .antMatchers("/emp").hasAuthority("EMP")
		  
		  
		  .and()
		  .formLogin()
		  .defaultSuccessUrl("/common",true)
		  
		  .and()
		  .logout()
		  .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		  
		  .and()
		  .exceptionHandling()
		  .accessDeniedPage("/denied");
		  
		  
	 }
	 
	 
	 
}