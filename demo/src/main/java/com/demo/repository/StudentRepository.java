package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.controller.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
 
}
