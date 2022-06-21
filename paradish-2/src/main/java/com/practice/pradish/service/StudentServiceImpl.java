package com.practice.pradish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.pradish.entity.Student;
import com.practice.pradish.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Integer saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student).getSno();
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer sno) {
		// TODO Auto-generated method stub
		return studentRepository.findById(sno).get();
	}

	@Override
	public void deleteStudent(Integer sno) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(sno);
	}
	
	
	
	
}
