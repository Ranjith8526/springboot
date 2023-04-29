package com.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.review.model.RailWay;
import com.review.service.RailWayService;

@RestController
public class RailWayController {
	
	@Autowired
	RailWayService rs;
	
	@GetMapping("/save") 
	public List<RailWay> getAllDetails()
	{
		return rs.getAllDetails();
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody RailWay id) {
		
		rs.postDetails(id);
		return "Details Saved";
	}
	
	@PutMapping("/put")
	public String putDetails(@RequestBody RailWay iid) {
		
		rs.putDetails(iid);
		return "Details edited";
	}
	
	@GetMapping("/save/{id}")
	
	public RailWay SaveAll(@PathVariable int id) {
		
		return rs.getDetailsById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	
	public String deleteAll(@PathVariable int id) {
		
		rs.deleteById(id);
		return "Details Deleted";
	}
	
    @GetMapping("/sortDetails/{field}")
    public List<RailWay> sortDetails(@PathVariable String field){
    	return rs.sortDetails(field);
    }
    
   @GetMapping("/desortDetails/{field}")
    public List<RailWay> desortDetails(@PathVariable String field){
      return rs.desortDetails(field);
   }
    
    
    
    @GetMapping("/listPagingRailWay/{offset}/{PageSize}")
    public List<RailWay> ListRailWay(@PathVariable int offset,@PathVariable int PageSize)
    {
        return rs.listRailWay(offset, PageSize);
    }
    

    
    @GetMapping("/sortListRailWay/{offset}/{pageSize}/{field}")
    public List<RailWay> sortListDetails(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
    {
    	return rs.sortListDetails(offset, pageSize,field);
    } 
    
    @GetMapping("/pageListRailWay/{offset}/{pageSize}/{field}")
    public Page<RailWay> sortPagingDetails(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
    {
    	return rs.sortPagingDetails(offset, pageSize, field);
    }
    
    
    @GetMapping("/fetchPagingPrefix")
    public List<RailWay> fetchPagingPrefix(@RequestParam String prefix)
    {
    	return rs.fetchRailWayDetails(prefix);
    }
}
