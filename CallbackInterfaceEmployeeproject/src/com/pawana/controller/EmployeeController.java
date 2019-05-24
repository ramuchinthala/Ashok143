package com.pawana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pawana.empdtls.Employee;
import com.pawana.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	
	
	public void setService(EmployeeService service) {
		this.service = service;
	}

	public Employee getEmployee(int id) {
		return service.getEmployeeById(id);
	}
	
	public List<Employee> getEmployees(){
		return service.getAllEmployees();
	}
	
}
