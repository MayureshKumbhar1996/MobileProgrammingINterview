package com.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.Employee;
import com.Employee.servie.empService;

@RestController
public class mainController {
	
	@Autowired
	private empService empService;
	

	
	@PostMapping(value = "/")
	public ResponseEntity<Employee>setUser(@RequestBody Employee employee){
		
		Employee setEmployee = empService.setEmployee(employee);
		
		return new ResponseEntity<>(setEmployee,HttpStatus.OK);
		
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Employee> getUser(@PathVariable int id){
		
		Employee emp = empService.getEmp(id);
		
		return new ResponseEntity<>(emp,HttpStatus.OK);
		
	}
}
