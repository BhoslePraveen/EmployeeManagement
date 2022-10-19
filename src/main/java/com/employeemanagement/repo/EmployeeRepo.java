package com.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public Employee findByName(String name);

}