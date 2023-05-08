package com.demo.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Loan.Model.UserModel;

@Repository
public interface UserModelRepository extends JpaRepository <UserModel,Integer>{

}
