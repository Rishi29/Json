package com.jacksonexample;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonObjToJavaObject {

	public static void main(String[] args) {

		File jsonInputFile = new File("src/main/resources/employeeJson.txt");

		ObjectMapper mapper = new ObjectMapper();

		try {

			Employee emp = mapper.readValue(jsonInputFile, Employee.class);
			System.out.println(emp.toString());

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
