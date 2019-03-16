package com.jacksonexample;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


/**
 * @author Rishi
 *
 */
public class JsonStringToHashMap {

	public static void main(String[] args) {

		String jsonStr = "{ \"name\":\"Rishi\", \"company\":\"Synapse\" }";
		Map<String, String> resultMap = new HashMap<String, String>();
		System.out.println("Input Json: " + jsonStr);
		ObjectMapper objMapper = new ObjectMapper();
		try {
			resultMap = objMapper.readValue(jsonStr, new TypeReference<HashMap<String, String>>() {
			});
			System.out.println("result Map " + resultMap);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
