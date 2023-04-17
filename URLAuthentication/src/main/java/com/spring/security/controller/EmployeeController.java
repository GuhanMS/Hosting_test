package com.spring.security.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.security.model.Employee;
import com.spring.security.repo.EmployeeInterface;
import com.spring.security.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeInterface employeeInterface;


	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/Home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("Home");
		return modelAndView;
	}

//	Adding Data in MYSQL Database
	@PostMapping("/addData")
	public ModelAndView registerStd(@ModelAttribute Employee user, BindingResult bindingResult, HttpServletRequest request,
			Model model) {
		ModelAndView modelAndView = new ModelAndView("Home");
		employeeInterface.save(user);
		return modelAndView;
	}

	@GetMapping("/AllUsers")
	public String getData(HttpServletRequest request) {
		request.setAttribute("user", employeeService.showAllStudent());
		return "AllUser";
	}

}