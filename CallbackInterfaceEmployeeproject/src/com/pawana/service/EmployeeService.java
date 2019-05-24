package com.pawana.service;

import java.util.List;

import com.pawana.empdtls.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
}
