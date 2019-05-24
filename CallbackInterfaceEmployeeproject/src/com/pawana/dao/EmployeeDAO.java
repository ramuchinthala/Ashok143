package com.pawana.dao;

import java.util.List;

import com.pawana.empdtls.Employee;

public interface EmployeeDAO {
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
}
