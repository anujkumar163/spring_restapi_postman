package com.practice.pradish3.services;

import java.util.List;

import com.practice.pradish3.entity.Student;


public interface StudentService {
	public Integer saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Integer sno);
	
	public void deleteStudent(Integer sno);
	
}
