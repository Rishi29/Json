package com.jacksonexample;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JavaObjToJsonString {

	public static void main(String[] args) {

		Employee emp = new Employee(1, "Rishi", "Java Developer", "SoftwareDevelopment", 90000);
		ObjectMapper mapperObj = new ObjectMapper();

		try {

			String jsonStr = mapperObj.writeValueAsString(emp);
			System.out.println(jsonStr);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
