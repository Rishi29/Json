package com.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Rishi 
 * we do not put @Expose on the top of the field that we dont need in our Json
 */
public class Employee {

	@Expose
	@SerializedName("emp_name")
	private String employeeName;

	@Expose
	@SerializedName("emp_id")
	private int employeeId;

	@Expose
	private String address;

	private int salary;

	public Employee() {

	}

	public Employee(String employeeName, int employeeId, String address, int salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.address = address;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
