package com.training.ui;

import java.util.List;
import java.util.stream.DoubleStream;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.comparator.EmployeeBasicSalaryAscendingComparator;
import com.training.bean.comparator.EmployeeBasicSalaryDescendingComparator;

public class Main07 {

	public static void main(String[] args) {
		List<Employee> allEmployees = CollectionFactory.getEmployeeList();
		
		allEmployees
		.stream()
		.sorted(new EmployeeBasicSalaryAscendingComparator())
		.forEach((e)->System.out.println(e));

	System.out.println("-------------------------------");
	
	allEmployees
		.stream()
		.sorted(new EmployeeBasicSalaryDescendingComparator())
		.forEach((e)->System.out.println(e));


	}

}
