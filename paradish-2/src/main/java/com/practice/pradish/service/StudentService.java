package com.practice.pradish.service;

import java.util.List;

import com.practice.pradish.entity.Student;

public interface StudentService {
	
	public Integer saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer sno);
	
	public void deleteStudent(Integer sno);
	
	
	
}
