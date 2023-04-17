package com.spring.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.model.Employee;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee, Integer>{

}
