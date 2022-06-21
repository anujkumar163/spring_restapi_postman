package com.practice.pradish.services;

import java.util.List;

import com.practice.pradish.entity.Employee;

public interface EmployeeService {

	 Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();
	//Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);

	Employee getEmployeById(long id);
	
}
