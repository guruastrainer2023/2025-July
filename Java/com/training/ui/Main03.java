package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Student;
import com.training.bean.comparator.StudentMarkComparator;

public class Main03 {

	public static void main(String[] args) {
		
		
		
		List<Employee> allEmployees = CollectionFactory.getEmployeeList();
		
		
		allEmployees
			.stream()
			.sorted()
			.filter((e)->e.getCityName().equals("Chennai"))
			.forEach((e)->System.out.println(e));
		
		//print only male employees
		//print only female employees
		//print the employees whose basic Salary is above 20000
		
		
	}

}
