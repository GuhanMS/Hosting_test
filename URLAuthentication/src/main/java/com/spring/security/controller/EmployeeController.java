package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping("/Home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("Home");
		return modelAndView;
	}

}