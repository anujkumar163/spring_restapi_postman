package com.practice.pradish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.pradish.entity.Student;
import com.practice.pradish.service.StudentService;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		Integer id = service.saveStudent(student);
		//return new ResponseEntity<String>(body "student with '"+id+"' has been saved ", HttpStatus.OK);
		return new ResponseEntity<String>(  "student with '"+id+"'  has been saved", HttpStatus.OK);
	}
	
	@GetMapping("/studentList")
	public ResponseEntity<List<Student>> getAllStudentDetails(){
		List<Student> list = service.getAllStudent();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentById/{sno}")
	public ResponseEntity<Student> getStudentById(@PathVariable("sno") Integer sno){
		Student std = service.getStudentById(sno);
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}
	
	@PostMapping("/updateStudent/{sno}")
	public ResponseEntity<String> updateStudent(@PathVariable("sno") Integer sno, @RequestBody Student student){
		
		Student byId = service.getStudentById(sno);
		byId.setStdName(student.getStdName());
		byId.setStdClass(student.getStdClass());
		byId.setSchoolName(student.getSchoolName());
		Integer id = service.saveStudent(student);
		return new ResponseEntity<String>(  "student with '"+id+"'  has been saved", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{sno}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sno") Integer sno){
		service.deleteStudent(sno);
		return new ResponseEntity<String>(  "student with '"+sno+"'  has been saved", HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
