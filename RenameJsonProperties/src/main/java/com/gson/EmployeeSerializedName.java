package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EmployeeSerializedName {

	public static void main(String[] args) {

		Employee emp = new Employee("Rishi", 1, "NorthCarolina");

		Gson gsonObj = new GsonBuilder().setPrettyPrinting().create();
		String jsonStr = gsonObj.toJson(emp);
		System.out.println(jsonStr);

	}

}
