package com.example.ciaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ciaw.model.EmployeeModel;

@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeModel,String>{

}
