package com.spring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.model.Employee;
import com.spring.security.repo.EmployeeInterface;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeInterface employeeInterface;
	
	public List<Employee> showAllStudent() {
		List<Employee> users = new ArrayList<Employee>();
		for (Employee student : employeeInterface.findAll()) {
			users.add(student);
		}
		return users;
	}

}
