package com.practice.pradish3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	private String stdName;
	private String stdClass;
	private String schoolName;
	public Object getStdName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setStdName(Object stdName2) {
		// TODO Auto-generated method stub
		
	}
	public Object getStdClass() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setStdClass(Object stdClass2) {
		// TODO Auto-generated method stub
		
	}
	public Object getSchoolName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setSchoolName(Object schoolName2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
