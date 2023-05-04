package com.example.ciaw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeModel {

	@Id
	private String posting;
	private int dob;
	private int salary;
	private  String dept;
	public String getPosting() {
		return posting;
	}
	public void setPosting(String posting) {
		this.posting = posting;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

	
}
