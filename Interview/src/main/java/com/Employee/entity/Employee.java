package com.Employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empNameString;
	private String empLocationString;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empId, String empNameString, String empLocationString) {
		super();
		this.empId = empId;
		this.empNameString = empNameString;
		this.empLocationString = empLocationString;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNameString() {
		return empNameString;
	}
	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}
	public String getEmpLocationString() {
		return empLocationString;
	}
	public void setEmpLocationString(String empLocationString) {
		this.empLocationString = empLocationString;
	}
	
	
}
