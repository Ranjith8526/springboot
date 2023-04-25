package com.Ranjith.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ranjith.demo.model.Student;

@Repository
public interface StudentD extends JpaRepository<Student,Integer>{

}
