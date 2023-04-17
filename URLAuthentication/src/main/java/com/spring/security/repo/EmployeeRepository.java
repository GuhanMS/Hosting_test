package com.spring.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
