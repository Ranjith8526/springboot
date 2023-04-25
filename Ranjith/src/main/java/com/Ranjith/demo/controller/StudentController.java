package com.Ranjith.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ranjith.demo.model.Student;
import com.Ranjith.demo.service.StudentDetails;

@RestController
public class StudentController{
	@Autowired
StudentDetails s;
	
	@GetMapping("/fetchStudents")
	public List<Student> allDetails()
	{
	return s.fetchStudents();
	}
	@PostMapping(value="/savestudent")
	public Student saveStudent(@RequestBody Student ss)
	{
		return s.saveStudent(ss);
	}
	@PutMapping(value="/save")
	public Student saveStudents(@RequestBody Student ss)
	{
		return s.saveStudent(ss);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteStudent(@PathVariable("id")int regno)
	{
		 s.deleteStudent(regno);
	}
}
