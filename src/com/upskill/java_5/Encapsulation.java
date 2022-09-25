package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "abc";						// Write & read
	private int ssn = 123456789;						// Write Only
	private String username = "Upskill";				// Read Only
	
		// Setter Method - name
	public void setName(String value) {					//set the data, write
		name = value;
	}
	
	// Getter Method - name
	public String getName() {							// get the data, read
		return  name;
	}
	
	// Setter Method - ssn
	public void setSSN(int value){						// set the data, write
		ssn = value;
	}
	
	// Getter Method - username
	public String getUsername(){						// get the data, read
		return username;
	}
	
	public static void main(String[] args) {
		

	Encapsulation obj = new Encapsulation()	;
	obj.setName("Mamun");
	System.out.println(obj.getName());
	obj.setSSN(123456789);
	System.out.println(obj.getUsername());
		
		
	}

}
