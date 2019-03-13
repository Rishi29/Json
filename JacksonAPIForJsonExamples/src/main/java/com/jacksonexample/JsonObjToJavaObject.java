package com.jacksonexample;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonObjToJavaObject {

	public static void main(String[] args) {

		File jsonInputFile = new File("src/main/resources/employeeJson.txt");

		ObjectMapper mapper = new ObjectMapper();

		try {
			Employee emp = mapper.readValue(jsonInputFile, Employee.class);
			System.out.println(emp.toString());
		} catch (JsonParseException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
