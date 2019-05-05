package com.jacksonexample;

import org.codehaus.jackson.map.ObjectMapper;

public class PrettyPrinting {
	
	public static void main(String[]args) {
		
		Employee emp = new Employee(1,"Rishi","Java Developer", "IT" ,110000);
		
		ObjectMapper objmap = new ObjectMapper();
		
		try {
			String jsonStr = objmap.writeValueAsString(emp);
			System.out.println("Json String");
			System.out.println(jsonStr);
			
			String jsonString = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			
			System.out.println("Pretty printing");
			
			System.out.println(jsonString);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
