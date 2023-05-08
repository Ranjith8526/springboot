package com.demo.Loan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.Loan.Model.LoanApplicationModel;
import com.demo.Loan.Repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	
	@Autowired
	LoanApplicationRepository rr;
	public List< LoanApplicationModel> getAllDetails()
	{
		return rr.findAll();
	}
	
	public  LoanApplicationModel postDetails(@RequestBody  LoanApplicationModel id) {
		
		return rr.save(id);
	}
	public  LoanApplicationModel putDetails(@RequestBody  LoanApplicationModel iid) {
		
		return rr.save(iid);
	}
	
	public  LoanApplicationModel getDetailsById(@PathVariable int id) {
		
		return rr.findById(id).orElse(null);
	}
	
	public void deleteById(@PathVariable int id) {
		
		rr.deleteById(id);
	}

}
