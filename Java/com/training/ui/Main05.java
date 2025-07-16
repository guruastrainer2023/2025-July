package com.training.ui;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.training.bean.CollectionFactory;
import com.training.bean.Student;
import com.training.bean.comparator.StudentMarkComparator;

public class Main05 {

	public static void main(String[] args) {
		List<Student> students=CollectionFactory.getStudentList();
		
		Stream<Student> studStream=students.stream();
		
		studStream.sorted(new StudentMarkComparator()).filter((s)->s.getAverageMark()>80.0 ).forEach((s)-> {
			System.out.println(s.getRollNo()+ "\t"+ s.getName()+"\t"+ s.getAverageMark());
		});
		
		DoubleStream ds= studStream.mapToDouble((s)->s.getAverageMark());
		OptionalDouble opd=ds.max();
		if(opd.isPresent()) {
			System.out.println(opd.getAsDouble());
		}
		
		Optional<Student>minStud=studStream.min(new StudentMarkComparator());
		if(minStud.isPresent()) {
			System.out.println(minStud.get());
		}
		Optional<Student> optionalStud=studStream.findAny();
		if(optionalStud.isPresent())
			System.out.println(optionalStud.get());

	}

}
