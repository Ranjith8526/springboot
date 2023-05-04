package com.example.ciaw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ciaw.model.EmployeeModel;
import com.example.ciaw.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService er;
	
	@GetMapping("/fetch")
	public  List<EmployeeModel> getAllDetails()
	{
		return er.getAllDetails();
	}
	@PostMapping("/save")
	public EmployeeModel postDetails(@RequestBody EmployeeModel id)
	{
		return er.postDetails(id);
		
	}
	

}
