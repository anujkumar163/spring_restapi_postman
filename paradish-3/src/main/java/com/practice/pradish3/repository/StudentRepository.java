package com.practice.pradish3.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.pradish3.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
