package com.pawana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pawana.dao.EmployeeDAO;
import com.pawana.empdtls.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
