package com.training.model;

public class Employee {
	int id;
	String name;
	double basic;
	String gender;
	
	//formal
	
	public double getAllowance() {
		return this.basic*0.45;
	}
	
	public double getTax() {
		return this.basic*0.10;
	}
	
	public double getNetSalary() {
		return this.basic+this.getAllowance()-this.getTax();
	}
}
