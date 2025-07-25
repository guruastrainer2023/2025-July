package com.training.bean.comparator;

import java.util.Comparator;

import com.training.bean.Student;


public class StudentDepartmentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}

}
