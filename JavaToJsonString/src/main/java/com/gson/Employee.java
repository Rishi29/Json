package com.gson;

public class Employee {
	
	private int Id;
	private String name;
	private String email;
	private long salary;
	
		
	public Employee(int id, String name, String email, long salary) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
