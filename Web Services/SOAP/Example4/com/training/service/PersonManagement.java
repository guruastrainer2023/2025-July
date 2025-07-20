package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.bean.Person;

public class PersonManagement {
	
	private List<Person> allPersons=new ArrayList<>();

	public PersonManagement() {
		super();
		Person p1=new Person(101, "Ram", 5000.00);
		Person p2=new Person(102, "Shalini", 3000.00);
		Person p3=new Person(103, "Anurag", 15000.00);
		Person p4=new Person(104, "Reshmi", 6000.00);
		Person p5=new Person(105, "Dinesh", 4000.00);
		allPersons.add(p1); allPersons.add(p2); allPersons.add(p3);
		allPersons.add(p4); allPersons.add(p5);
	}
	
	public List<Person> addPerson(Person p){
		this.allPersons.add(p);
		System.out.println("Add"+this.allPersons);
		return this.allPersons;
	}
	
	public List<Person> updatePerson(Person p){
		int index=this.allPersons.indexOf(p);
		if(index>=0) {
			this.allPersons.set(index, p);
		}else {
			System.out.println("Person Not Found for updation");
		}
		System.out.println("Update "+ this.allPersons);
		return this.allPersons;
	}
	
	public List<Person> deletePerson(Person p){
		int index=this.allPersons.indexOf(p);
		if(index>=0) {
			this.allPersons.remove(p);
		}else {
			System.out.println("Person Not Found for Deletion");
		}
		System.out.println("Delete "+ this.allPersons);
		return this.allPersons;
	}
	
	public List<Person> getAllPersons(){
		System.out.println("List :"+this.allPersons);
		return this.allPersons;
	}
	
	public Person getPersonById(int id) {
		Person p=new Person(id);
		int index=this.allPersons.indexOf(p);
		if(index>=0) {
			return this.allPersons.get(index);
		}else {
			return null;
		}
	}
	
	

}
