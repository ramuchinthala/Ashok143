package com.pawana.empdtls;

public class Employee {
private String name;
private int id;
private double salary;
private int age;

public Employee(String name, int id, int salary, int age) {
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.age=age;
}


public Employee() {
	// TODO Auto-generated constructor stub
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
}





}
