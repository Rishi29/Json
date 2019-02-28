package com.gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class JsonToJavaObj {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/main/resources/employeeJson.txt"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception " + e.getMessage());

		}

		Gson gson = new Gson();
		Employee emp = gson.fromJson(br, Employee.class);
		System.out.println(emp.toString());

	}

}
