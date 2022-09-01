package com.Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
