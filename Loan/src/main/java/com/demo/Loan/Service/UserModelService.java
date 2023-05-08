package com.demo.Loan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Loan.Model.UserModel;
import com.demo.Loan.Repository.UserModelRepository;

@Service
public class UserModelService {
	
	@Autowired
	UserModelRepository ur;
	
	public List<UserModel> getDetail()
	{
		return ur.findAll();
	}
	public UserModel postDetail(UserModel id)
	{
		return ur.save(id);
	}
	public void delete(int id)
	{
		ur.deleteById(id);
	}
	public UserModel update(UserModel id)
	{
		return ur.save(id);
	}
}
