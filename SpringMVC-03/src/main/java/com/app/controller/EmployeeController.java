package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {

	    @RequestMapping("/display")
	   public ModelAndView modelAndView() {
		
		    ModelAndView modelAndView = 
		    		 new ModelAndView();
		    modelAndView.setViewName("Show_Employee");
		/*
		 * Employee employee = new Employee(); employee.setEmpId(10);
		 * employee.setEmpName("Asif"); employee.setEmpSal("1000");
		 * modelAndView.addObject("data", employee);
		 */
		    
		    List<Object> list =
		        Arrays.asList(10,"asif raza","10000");
		    modelAndView.addObject("data", list);
		    
		    
		    return modelAndView;
	}
}
