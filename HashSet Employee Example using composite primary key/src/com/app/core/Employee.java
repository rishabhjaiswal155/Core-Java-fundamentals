package com.app.core;

import java.time.LocalDate;

public class Employee {
private String empId;
private String name;
private double salary;
private int deptId;
private LocalDate dob;
public Employee(String empId, String name, double salary, int deptId, LocalDate dob) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.deptId = deptId;
	this.dob = dob;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + ", dob=" + dob
			+ "]";
}

@Override
public boolean equals(Object o) {
	System.out.println("In Employee's equals");
	if(o instanceof Employee) {
		Employee e=(Employee)o;
		return this.empId.equals(e.empId) && this.deptId==e.deptId;
	}
	return false;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + deptId;
	result = prime * result + ((empId == null) ? 0 : empId.hashCode());
	return result;
}
}

