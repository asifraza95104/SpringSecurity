package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	      @RequestMapping("/show1")
	     public ModelAndView modelAndView()
	     {
	    	   ModelAndView  modelAndView  = 
	    			     new ModelAndView();
	    	   modelAndView.setViewName("Home");
	    	   return modelAndView;
	     }
	 
}
