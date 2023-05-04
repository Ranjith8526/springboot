package com.Review1.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Review1.demo.model.Railway;

@Repository
public interface RailwayRepository extends JpaRepository <Railway,Integer>{

}
