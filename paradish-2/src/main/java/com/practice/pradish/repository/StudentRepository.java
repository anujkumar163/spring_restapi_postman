package com.practice.pradish.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.pradish.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
