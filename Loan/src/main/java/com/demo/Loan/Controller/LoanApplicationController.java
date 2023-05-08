package com.demo.Loan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Loan.Model.LoanApplicationModel;
import com.demo.Loan.Service.LoanApplicationService;


@RestController
public class LoanApplicationController {
	
		@Autowired
		LoanApplicationService rs;
		
		
		@GetMapping("/save") 
		public List<LoanApplicationModel> getAllDetails()
		{
			return rs.getAllDetails();
		}
		
		
		@PostMapping("/post")
		public String postDetails(@RequestBody  LoanApplicationModel id) {
			
			rs.postDetails(id);
			return "Details Saved";
		}
		
		
		@PutMapping("/put")
		public String putDetails(@RequestBody LoanApplicationModel iid) {
			
			rs.putDetails(iid);
			return "Details edited";
		}
		
		
		@GetMapping("/save/{id}")
		
		public LoanApplicationModel SaveAll(@PathVariable int id) {
			
			return rs.getDetailsById(id);
		}
		
		
		@DeleteMapping("/delete/{id}")
		
		public String deleteAll(@PathVariable int id) {
			
			rs.deleteById(id);
			return "Details Deleted";
		}
		
}
