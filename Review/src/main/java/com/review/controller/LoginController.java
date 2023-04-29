package com.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review.model.LoginModel;
import com.review.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService ls;
	
	@GetMapping("/getuser")
	public List<LoginModel> getUserDetail()
	{
		return ls.getUserDetails();
	}
	
	@PostMapping("/saveUser")
	public LoginModel saveUserDetail(@RequestBody LoginModel u)
	{
		return ls.saveUserDetail(u);
	}

}

