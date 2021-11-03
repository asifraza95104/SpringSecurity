package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class MyEmployeeController {

	 
	   @RequestMapping("/show")
	   public ModelAndView modelAndView()
	   {
		    ModelAndView modelAndView =
		    		 new ModelAndView();
		    modelAndView.setViewName("Register");
		    return modelAndView;
	   }
	   
	   
	   @RequestMapping("/reg")
	   public ModelAndView  register(@ModelAttribute("employee")Employee emp)
	   {

		      ModelAndView modelAndView
		      =new ModelAndView();
		      modelAndView.setViewName("Register");
		      modelAndView.addObject("emp", emp);
		      return modelAndView;
	   }
	   
}
