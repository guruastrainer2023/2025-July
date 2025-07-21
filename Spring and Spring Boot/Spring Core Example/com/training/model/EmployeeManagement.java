package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class EmployeeManagement {
	List<Employee> employees;
	
	public void initialize() {
		this.employees=new LinkedList<Employee>();
		System.out.println("initialing employees");
	}
	
	
	public void cleanUp() {
		this.employees.clear();
		this.employees=null;
		System.out.println("cleaning up employees");
	}
}
