package com.practice.pradish.controller;

import java.util.List;
import com.practice.pradish.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.pradish.services.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	//@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	//build create employee rest api
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		
		 employeeService.saveEmployee(employee);
		
		 return employee;
	}
	
	@GetMapping
	public List<Employee>  getAll(){
		return employeeService.getAllEmployee();
	}
	
	
	
	
}
