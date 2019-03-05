package com.gson;

import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrettyPrinting {

	public static void main(String[] args) {

		HashMap<String, String> inputMap = new HashMap<String, String>();
		inputMap.put("Name", "Rishi");
		inputMap.put("Subject", "Computer Science");

		Gson gsonObj = new GsonBuilder().setPrettyPrinting().create();
		String jsonStr = gsonObj.toJson(inputMap);

		System.out.println(jsonStr);

	}

}
