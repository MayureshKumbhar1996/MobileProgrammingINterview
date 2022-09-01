package com.Employee.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Repo.EmpRepo;
import com.Employee.entity.Employee;
import com.Employee.servie.empService;
@Service
public class empServiceImpl implements empService{

	@Autowired
	EmpRepo empRepo;
	
	@Override
	public Employee setEmployee(Employee e1) {
		Employee employee = empRepo.save(e1);
		return employee;
	}

	@Override
	public Employee getEmp(int id) {
		
		Optional<Employee> byId = empRepo.findById(id);
		
		return byId.get();
	}
	

}
