package com.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.review.model.RailWay;
import com.review.repository.RailWayRepository;

@Service
public class RailWayService 
{


	@Autowired
	RailWayRepository rr;
	public List<RailWay> getAllDetails()
	{
		return rr.findAll();
	}
	
	public RailWay postDetails(@RequestBody RailWay id) {
		
		return rr.save(id);
	}
	public RailWay putDetails(@RequestBody RailWay iid) {
		
		return rr.save(iid);
	}
	
	public RailWay getDetailsById(@PathVariable int id) {
		
		return rr.findById(id).orElse(null);
	}
	
	public void deleteById(@PathVariable int id) {
		
		rr.deleteById(id);
	}
	
	public List<RailWay> sortDetails(String field)
	{
		return rr.findAll(Sort.by(field));
	}
	
	public List<RailWay> desortDetails(String field)
	{
		return rr.findAll(Sort.by(Direction.DESC,field));
	}
	
	public List<RailWay> listRailWay(int offset,int pageSize)
	{
		Pageable paging = PageRequest.of(offset, pageSize);
		Page<RailWay> railDetail=rr.findAll(paging);
		List<RailWay> railList=railDetail.getContent();
		return railList;	
	}
	
	public Page<RailWay> pagingRailWay(int offset,int pageSize)
	{
		Pageable paging = PageRequest.of(offset, pageSize);
		Page<RailWay> railDetail=rr.findAll(paging);
		return railDetail;
	}
	
	public List<RailWay> sortListDetails(int offset,int pageSize,String field)
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<RailWay> railDetail=rr.findAll(paging);
		List<RailWay> railList=railDetail.getContent();
		return railList;
	}
	
	public Page<RailWay> sortPagingDetails(int offset,int pageSize,String field)
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<RailWay> railDetail=rr.findAll(paging);
		return railDetail;
	}
	
	public List<RailWay> fetchRailWayDetails(String prefix)
	{
		return rr.findByTrainnameStartingWith(prefix);
	}
	
}
