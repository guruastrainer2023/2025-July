package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.training.bean.Person;
import com.training.bean.comparator.PersonNameComparator;

public class Main11 {

	public static void main(String[] args) {
		List<Person> allPersons=new LinkedList<>();
		allPersons.add(new Person("Ram", 24));
		allPersons.add(new Person("Dinesh", 44));
		allPersons.add(new Person("Reshmi", 28));
		allPersons.add(new Person("Mamta", 30));
		allPersons.add(new Person("Seetha", 36));
		
		Optional<Person> optionalResult1=allPersons
			.stream()
			.min(new PersonNameComparator());
	
		if(optionalResult1.isPresent()) {
			System.out.println(optionalResult1.get());
		}else {
			System.out.println("Collection is empty");
		}
		System.out.println("--------------------------------");
		
		Optional<Person> optionalResult2= allPersons
			.stream()
			.min(
				(p1,p2)->p1.getAge()-p2.getAge()	
			);
		if(optionalResult2.isPresent()) {
			System.out.println(optionalResult2.get());
		}else {
			System.out.println("Collection is empty");
		}
			
		//find max object in allPersons collection based on age
		//find max object in allPersons collection based on name	

	}

}
