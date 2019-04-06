package com.jacksonexample;

import java.util.HashMap;

import org.codehaus.jackson.map.ObjectMapper;

public class HashMapToJsonStr {
	
	public static void main(String[] args) {

		HashMap<String, String> myMap = new HashMap<String, String>();
		myMap.put("Name", "Rishi");
		myMap.put("Subject", "Computer Science");

		ObjectMapper objmapper = new ObjectMapper();

		try {
			String jsonStr = objmapper.writeValueAsString(myMap);

			System.out.println(jsonStr);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
