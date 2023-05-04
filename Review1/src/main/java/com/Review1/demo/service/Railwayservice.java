package com.Review1.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Review1.demo.Repository.RailwayRepository;
import com.Review1.demo.model.Railway;

@Service
public class Railwayservice {
	@Autowired
	RailwayRepository ry;
	
	public List<Railway> getAllDetails()
	{
		return ry.findAll();
	}
	public Railway saveDetails(@RequestBody Railway rt)
	{
		return ry.save(rt);
	}
	public Railway saveInfos(@RequestBody Railway rs)
	{
		return ry.save(rs);
	}
	
	public void deleteDetails(@PathVariable int a) {
		ry.deleteById(a);
	}
}
