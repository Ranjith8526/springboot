package com.Review1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Review1.demo.model.Railway;
import com.Review1.demo.service.Railwayservice;

@RestController
public class Railwaycontroller {
	@Autowired
	Railwayservice rly;
	

	@GetMapping("/rail")
	public List<Railway> getallDetails()
	{
		return rly.getAllDetails();
	}
	@PostMapping("/save")
	public Railway addDetails(@RequestBody Railway ru)
	{
		return rly.saveDetails(ru);
	}
	@PutMapping("/savetrain")
	public Railway addDetail(@RequestBody Railway r)
	{
		return rly.saveInfos(r);
	}
	@DeleteMapping("/Delete/{s}")
	public String deleteDetails(@PathVariable int s)
	{
		rly.deleteDetails(s);
		return "Deleted";
	}
	
	
}
