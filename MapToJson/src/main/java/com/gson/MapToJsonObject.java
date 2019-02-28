package com.gson;

import java.util.HashMap;
import com.google.gson.Gson;

public class MapToJsonObject {

	public static void main(String[] args) {

		HashMap<String, String> inputMap = new HashMap<String, String>();
		inputMap.put("Name", "Rishi");
		inputMap.put("Subject", "Computer Science");

		Gson gsonObj = new Gson();

		String jsonStr = gsonObj.toJson(inputMap);
		System.out.println("Json Output : " + jsonStr);

	}

}
