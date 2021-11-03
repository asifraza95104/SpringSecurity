package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/show")
	public ModelAndView showPage() {
		ModelAndView m = new ModelAndView();
		m.setViewName("Home");
		return m;
	}
}