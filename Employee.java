package com.example.bean;

public class Employee {

	private int id;
	private String country;
	private String name;
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String country, String name, double salary) {
		super();
		this.id = id;
		this.country = country;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", country=" + country + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
