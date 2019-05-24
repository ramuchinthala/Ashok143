package com.pawana.controller;

import com.pawana.empdtls.Employee;
import com.pawana.service.Service;

public class Controller {
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	public String insert(Employee emp) {
		return service.insert(emp);
		
	}
public String update(Employee emp) {
	return service.update(emp);
}
public String delete(Employee emp) {
	return service.delete(emp);
}
public String view(Employee emp) {
	return service.view(emp);
}

}
