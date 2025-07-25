package com.training.bean.comparator;

import java.util.Comparator;

import com.training.bean.Employee;


public class EmployeeDateOfJoiningComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getHiredDate().isBefore(o2.getHiredDate()))
			return -1;
		if(o1.getHiredDate().isAfter(o2.getHiredDate()))
			return 1;
		return 0;
	}

}
