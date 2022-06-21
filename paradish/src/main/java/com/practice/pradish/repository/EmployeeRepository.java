package com.practice.pradish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.pradish.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
