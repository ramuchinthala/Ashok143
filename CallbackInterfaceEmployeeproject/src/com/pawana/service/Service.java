package com.pawana.service;

import com.pawana.dao.Dao;
import com.pawana.empdtls.Employee;

public class Service {
	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
 public String insert(Employee emp) {
	 return dao.insert(emp);
 }
 public String update(Employee emp) {
	 return dao.update(emp);
 }
 public String delete(Employee emp) {
	 return dao.delete(emp);
 }
 public String view(Employee emp) {
	 return dao.view(emp);
 }
}
