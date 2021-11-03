package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	    @RequestMapping("/show")
	   public ModelAndView modelAndView()
	   {
		   ModelAndView modelAndView = new ModelAndView();
		   modelAndView.setViewName("Home");
		   List <String> name = 
				     Arrays.asList("Asif", "Junaid", "Ritu");
		   modelAndView.addObject("data", name);
		   
		   return modelAndView;
	   }
}
