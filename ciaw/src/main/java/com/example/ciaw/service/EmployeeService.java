package com.example.ciaw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ciaw.model.EmployeeModel;
import com.example.ciaw.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository es;
	public List<EmployeeModel> getAllDetails()
	{
		return es.findAll();
	}
	public EmployeeModel postDetails(@RequestBody EmployeeModel id)
	{
		return es.save(id);
	}

}
