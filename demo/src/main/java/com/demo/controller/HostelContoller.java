package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.repository.StudentRepository;

@RestController
public class HostelContoller {
	@Autowired
	private StudentRepository repository;

	@PostMapping("hostel/student/save")
	public String saveData(@RequestBody Student student) {
		System.out.println(student);
		repository.save(student);
		return "Data saved sucessfully";

	}
	@GetMapping("/myTest")
	public Student test() {
		Student student=new Student();
		student.setName("Twinkle");
		return student;
	}
}
