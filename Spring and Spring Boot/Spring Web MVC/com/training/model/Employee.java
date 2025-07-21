package com.training.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

public class Employee {
	@Min(value=1, message="Id should be above 1")
	int id;
	
	@NotNull(message = "Name is mandatory...Cannot be left blank")
	String name;
	
	String gender;
	
	@Size(min = 4, max=20 , message = "Length of City should be between 4 to 20")
	String city;
	
	@Min(value = 1000, message="Basic Salary should be atleast 1000")
	double basic;
	
	public Employee(int id, String name, String gender, String city, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.basic = basic;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + ", basic=" + basic
				+ "]";
	}
	
	public double getAllowance() {
		return this.basic*0.4;
	}
	
	public double getTax() {
		return this.basic*0.1;
	}
	
	public double getNetSalary() {
		return this.basic+this.getAllowance()-this.getTax();
	}
	
}
