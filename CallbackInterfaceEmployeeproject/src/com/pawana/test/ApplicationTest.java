package com.pawana.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pawana.controller.EmployeeController;
import com.pawana.empdtls.Employee;

public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext ap=new FileSystemXmlApplicationContext("src/com/pawana/cfgs/ApplicationContext.xml");
		EmployeeController con=ap.getBean("controller", EmployeeController.class);
		
     /*Employee emp1=new Employee();
     emp1.setName("buffon");
     emp1.setId(111);
     emp1.setSalary(5000);
     emp1.setAge(34);
     System.out.println(con.insert(emp1));
     //update
     emp1.setName("ramu");
     emp1.setId(104);
     System.out.println(con.update(emp1));
     
     //delete
    // emp1.setName("pk");
     emp1.setId(105);
     System.out.println(con.delete(emp1));
     //view
     
     System.out.println(con.view(emp1));*/
     
		Employee emp=con.getEmployee(101);
		System.out.println("Id "+emp.getId());
		System.out.println("Name "+emp.getName());
		System.out.println("Sal "+emp.getSalary());
		System.out.println("Age "+emp.getAge());
		
		List<Employee> list=con.getEmployees();
		for(Employee e:list) {
			System.out.println(e);
		}
     
	}

}
