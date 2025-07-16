package com.training.ui;

import java.util.List;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;

public class Main06 {

	public static void main(String[] args) {
		
		List<Employee> allEmployees = CollectionFactory.getEmployeeList();
		
		allEmployees
			.stream()
			.map(e->e.getBasic())
			.forEach((b)->System.out.println(b));
		
		System.out.println("-----------------------");
		
		allEmployees
			.stream()
			.map(e->e.getCityName().toUpperCase())
			.forEach((cn)->System.out.println(cn));
		System.out.println("-----------------------");
		// print only the gender of employees
		
		allEmployees
			.stream()
			.mapToDouble(e->e.getNetSalary())
			.forEach((d)->System.out.println(d));
		
		System.out.println("----------------------------");

	}

}
