package com.training.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionFactory {
	
	public static List<Circle> getCircleList(){
		List<Circle> circles=new LinkedList<>();
		Circle c1=new Circle(90);
		Circle c2=new Circle(120);
		Circle c3=new Circle(60);
		Circle c4=new Circle(5);
		Circle c5=new Circle(72);
		Circle c6=new Circle(88);
		Circle c7=new Circle(64);
		Circle c8=new Circle(100);
		
		circles.add(c1);circles.add(c2);circles.add(c3);circles.add(c4);
		circles.add(c5);circles.add(c6);circles.add(c7);circles.add(c8);
		
		return circles;
	}
	
	public static List<Square> getSquareList(){
		List<Square> squares=new ArrayList<>();
		squares.add(new Square(7));
		squares.add(new Square(3));
		squares.add(new Square(10));
		squares.add(new Square(12));
		squares.add(new Square(5));
		return squares;
	}
	
	public static List<Employee> getEmployeeList(){
		List<Employee> employees=new LinkedList<>();
		
		Employee e1 = new Employee(10, "Ram", "Male", "Bangalore", 10000.00, LocalDate.of(1996, 10, 18), 'A');
		Employee e2 = new Employee(11, "Saranya", "Female", "Chennai", 20000.00, LocalDate.of(1998, 10, 12), 'A');
		Employee e3 = new Employee(12, "Lakshmi", "Female", "Bangalore", 30000.00, LocalDate.of(2002, 4, 22), 'B');
		Employee e4 = new Employee(13, "Vicky", "Male", "Cochin", 15000.00, LocalDate.of(2007, 1, 25), 'C');
		Employee e5 = new Employee(14, "Reshmi", "Female", "Chennai", 22000.00, LocalDate.of(2008, 7, 18), 'A');
		Employee e6 = new Employee(15, "Kiran", "Male", "Cochin", 10000.00, LocalDate.of(2005, 2, 5), 'C');
		Employee e7 = new Employee(16, "Saradha", "Female", "Chennai", 14000.00, LocalDate.of(1999, 6, 24), 'B');
		Employee e8 = new Employee(17, "Vinodh", "Male", "Bangalore", 50000.00, LocalDate.of(2000, 9, 16), 'A');
		Employee e9 = new Employee(18, "Sree Vidhya", "Female", "Cochin", 14000.00, LocalDate.of(2002, 8, 21), 'C');
		Employee e10 = new Employee(19, "Suresh", "Male", "Chennai", 21000.00,LocalDate.of(2002, 4, 4), 'B');
		
		Collections.addAll(employees, e1,e2,e3,e4,e5);
		
		return employees;
	}
	
	public List<Person> getPersonList(){
		List<Person> allPersons=new LinkedList<>();
		allPersons.add(new Person("Ram", 24));
		allPersons.add(new Person("Dinesh", 44));
		allPersons.add(new Person("Reshmi", 28));
		allPersons.add(new Person("Mamta", 30));
		allPersons.add(new Person("Seetha", 36));
		
		return allPersons;
	}
	
	public static List<Customer> getCustomerList(){
		List<Customer> customers=new ArrayList<>();
		Customer c1=new Customer("Abi Medicals", 3000.00, "Mumbai");
		Customer c2=new Customer("J J Pharmacy", 2000.00, "Mumbai");
		Customer c3=new Customer("Health & Glow", 500.00, "Delhi");
		Customer c4=new Customer("Apollo Medicals", 4000.00, "Mumbai");
		Customer c5=new Customer("GetWell Medicals", 2800.00, "Delhi");
		
		Collections.addAll(customers, c1,c2,c3,c4,c5);
		return customers;
	}
	
	public static List<Student> getStudentList(){
		List<Student> students=new LinkedList<>();
		Student s1=new Student(2501, "Kalpana", Gender.FEMALE, 88.0, "ECE");
		Student s2=new Student(2502, "Meghna", Gender.FEMALE, 72.0, "IT");
		Student s3=new Student(2503, "Aravind", Gender.MALE, 68.0, "CSE");
		Student s4=new Student(2504, "Rahul", Gender.MALE, 91.0, "IT");
		Student s5=new Student(2505, "Mohan", Gender.MALE, 81.0, "ECE");
		Student s6=new Student(2506, "Poojitha", Gender.FEMALE, 74.0, "CSE");
		
		Collections.addAll(students, s1,s2,s3,s4,s5,s6);
		return students;
	}
	
	public static List<Rectangle> getRectangleList(){
		List<Rectangle> rectangles=new LinkedList<>();
		rectangles.add(new Rectangle(10, 15));
		rectangles.add(new Rectangle(2, 7));
		rectangles.add(new Rectangle(8, 10));
		rectangles.add(new Rectangle(33, 20));
		
		return rectangles;
	}

}
 