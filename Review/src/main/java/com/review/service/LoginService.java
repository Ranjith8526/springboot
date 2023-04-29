package com.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.model.LoginModel;
import com.review.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository ur;
	public List<LoginModel> getUserDetails()
	{
		return ur.findAll();
	}
	public LoginModel saveUserDetail(LoginModel u)
	{
		return ur.save(u);
	}

}
