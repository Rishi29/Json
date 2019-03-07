package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Rishi
 *
 */
public class ExculdeFieldsFromJson {

	/**
	 *main method 
	 */
	public static void main(String[] args) {

		Employee emp = new Employee("Rishi", 1, "NorthCarolina", 9000);

		Gson gsonObj = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String jsonStr = gsonObj.toJson(emp);
		System.out.println(jsonStr);

	}

}
