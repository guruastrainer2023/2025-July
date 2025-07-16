package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;

public class Main10 {

	public static void main(String[] args) {
		List<Employee> allEmployees =CollectionFactory.getEmployeeList();
		
		
		long maleEmpCount=allEmployees
			.stream()
			.filter(e->e.getGender().equalsIgnoreCase("male"))
			.count();

		System.out.println(maleEmpCount);
		

	}

}
