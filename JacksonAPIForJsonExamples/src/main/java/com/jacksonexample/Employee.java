package com.jacksonexample;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({"emp_id","name","designation","department","salary"})
public class Employee {
	
	@JsonProperty("emp_id")
	private int id;
	private String name; 
	private String designation;
	private String department;
	private int salary;
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name, String designation, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
	
	

}
