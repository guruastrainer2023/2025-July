package com.training.bean;

import java.time.LocalDate;

public class Employee implements Comparable{
	private int id;
	private String name;
	private String gender;
	private String cityName;
	private double basic;
	private LocalDate hiredDate;
	private char grade;
	
	
	public Employee(int id, String name, String gender, String cityName, double basic, LocalDate hiredDate,
			char grade) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.cityName = cityName;
		this.basic = basic;
		this.hiredDate = hiredDate;
		this.grade = grade;
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public double getNetSalary() {
		return basic+(basic*0.40)-(basic*0.10);
	}
	
	

	public LocalDate getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", cityName=" + cityName + ", basic="
				+ basic + ", hiredDate=" + hiredDate + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Employee other=(Employee) o;
		if(this.id<other.id)
			return -1;
		
		if(this.id>other.id)
			return 1;
		
		return 0;
	}
	
	
}
