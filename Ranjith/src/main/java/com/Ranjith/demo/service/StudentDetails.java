package com.Ranjith.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Ranjith.demo.Repository.StudentD;
import com.Ranjith.demo.model.Student;

@Service
public class StudentDetails {

	@Autowired
	StudentD sd;
	public List<Student> fetchStudents()
	{
		return sd.findAll();
	}
	public Student saveStudent(@RequestBody Student ss)
	{
		return sd.save(ss);
	}
	public void deleteStudent(int regno)
	{
		sd.deleteById(regno);
	}
}
