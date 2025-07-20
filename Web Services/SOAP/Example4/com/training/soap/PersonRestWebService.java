package com.training.soap;

import java.util.List;



import com.training.bean.Person;
import com.training.service.PersonManagement;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class PersonRestWebService {
	
	PersonManagement pm=new PersonManagement();
	
	@WebMethod(operationName = "getAll")
	public List<Person> f1() {
		return this.pm.getAllPersons();
	}
	
	
	@WebMethod(operationName = "fetchById")
	public Person f2(int id) {
		return this.pm.getPersonById(id);
	}
	
	@WebMethod(operationName = "addPerson")
	public List<Person> f3(Person p){
		this.pm.addPerson(p);
		return this.pm.getAllPersons();
	}
	
	@WebMethod(operationName = "deletePerson")
	public List<Person> f4(Person p){
		this.pm.deletePerson(p);
		return this.pm.getAllPersons();
	}
	
	@WebMethod(operationName = "updatePerson")
	public List<Person> f5(Person p){
		this.pm.updatePerson(p);
		return this.pm.getAllPersons();
	}
	
	
	

}
