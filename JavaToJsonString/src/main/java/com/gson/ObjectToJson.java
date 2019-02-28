package com.gson;

import com.google.gson.Gson;

public class ObjectToJson {
	
	public static void main(String[]args) {
		
		Employee employee = new Employee(1,"Rohit", "rohit@gmail.com", 25000);
		
		Gson gson = new Gson();
		String employeeJsonStr = gson.toJson(employee);
		System.out.println(employeeJsonStr);
		
	}

}
