package com.training.bean.comparator;

import java.util.Comparator;

import com.training.bean.Employee;

public class EmployeeBasicSalaryDescendingComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getBasic()<o2.getBasic())
			return 1;
		if(o1.getBasic()>o2.getBasic())
			return 1;
		return 0;
	}

}
