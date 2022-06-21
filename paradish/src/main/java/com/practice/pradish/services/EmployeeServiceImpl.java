 package com.practice.pradish.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb27.entity.Locations;
import com.practice.pradish.entity.Employee;
import com.practice.pradish.repository.EmployeeRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	//@Autowired
	private EmployeeRepository employeerepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

//	@Override
//	public Employee saveEmployee(Employee employee) {
//		
//		return employeerepository.save(employee);
//	}
	@Override
	public Employee getEmployeById(long id) {
		java.util.Optional<Employee> employee =  employeerepository.findById(id);
		Employee employee1 = findById().get();
		return employee1;
		
	}

	private java.util.Optional<Employee> findById() {
		// TODO Auto-generated method stub
		employee
		return null;
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
