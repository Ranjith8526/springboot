package com.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer>{

}
