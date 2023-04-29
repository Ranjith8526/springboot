package com.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.model.UserModel;
import com.review.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	public String loginCheckData(String username,String password)
	{
		UserModel user = ur.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}

}
