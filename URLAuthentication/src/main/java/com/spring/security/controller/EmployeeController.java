package com.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.security.model.Employee;
import com.spring.security.repo.EmployeeRepository;


@Controller
public class EmployeeController {

	@RequestMapping("/login")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
//	@Autowired
//	private EmployeeRepository employeeData;
//
//	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
//	public String newEmployee(Employee employee) {
//
//		employeeData.save(employee);
//		return ("redirect:/listEmployees.html");
//
//	}
//	
//
//	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.GET)
//	public ModelAndView addNewEmployee() {
//
//		Employee emp = new Employee();
//		return new ModelAndView("newEmployee", "form", emp);
//
//	}
//
//	@RequestMapping(value = "/listEmployees.html", method = RequestMethod.GET)
//	public ModelAndView employees() {
//		List<Employee> allEmployees = employeeData.findAll();
//		return new ModelAndView("allEmployees", "employees", allEmployees);
//
//	}

}