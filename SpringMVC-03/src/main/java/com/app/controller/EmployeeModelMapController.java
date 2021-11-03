package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeModelMapController {

	
	@RequestMapping("/value")
	public String showPage(ModelMap modelMap)
	{
		     modelMap.addAttribute("data", "Asif Raza");
		     return "Value";
	}
}
