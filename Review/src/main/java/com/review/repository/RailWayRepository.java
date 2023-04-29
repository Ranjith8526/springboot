package com.review.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review.model.RailWay;

public interface RailWayRepository  extends JpaRepository<RailWay,Integer>{

	public List<RailWay>findByTrainnameStartingWith(String prefix);
	public List<RailWay>findByTrainnameEndingWith(String suffix);
	public List<RailWay>findByTrainname(String trainname);
	
}
