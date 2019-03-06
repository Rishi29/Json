package com.gson;

import com.google.gson.annotations.SerializedName;


/**
 * @author Rishi
 * demo to rename properties name in json
 */
public class Employee {
	
	@SerializedName("emp_name")
	private String employeeName;
	@SerializedName("emp_id")
	private int employeeId;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(String employeeName, int employeeId, String address) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.address = address;
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


}
