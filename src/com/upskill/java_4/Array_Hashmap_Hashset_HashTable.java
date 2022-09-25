package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String[] args) {
		
		// Array store multipul data using index
		
		int age = 30;												//Variable
		
		int[] ageChewbacca = new int[]{24, 45, 29, 35, 33, 28};		//Array
		//Array Index					0   1   2   3   4   5
		System.out.println("Student Age : " + ageChewbacca[5]);
		
		String[] nameChewbacca = new String[]{"Joy" , "Fariyan", "Alex", "Mamun", "Jahid", "Forhad"};
		//Array Index							0   	   1 	    2   	3  		 4  	 5
		System.out.println("Student Name : " + nameChewbacca[5]);
		System.out.println("Total Student : " + nameChewbacca.length);
		
		
		 // Multi - Dimentionl Array
		
		int[][]ageChewbacca2D = {{ 24 , 45 , 29, 33 , 28},					//[0][0]	[0][1]	[0][2]	[0][3]	[0][4]	[0][5]
		
									{ 27 , 45, 28}};						//[1][0]	[1][1]	[1][2]
		
		
		System.out.println(" Student Age 2D :" + ageChewbacca2D[1][2]);
		
		
		
		// Hasmap store multipul data using key - value pair, implementation of map interface
		HashMap< String, Integer> Student = new HashMap< String, Integer>();
		
		Student.put("Joy", 24);
		Student.put("Fariyan", 45);
		Student.put("Alex", 29);
		Student.put("Mamun", 35);
		Student.put("Jahid", 35);
		
		System.out.println(" Student Age" + Student.get("Alex"));
		
		HashMap< String, String> Capital = new HashMap< String, String>();
		
		Capital.put("BD", "Dhaka");
		
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City:" + Capital.get("USA"));
		
		
		// HashSet store unordered collection unique value ,Implementation of set interface
		
		HashSet< String> car = new HashSet< String>();
		
		car.add("BMW");
		
		car.add("Audi");
		
		car.add("Toyata");
		
		System.out.println("Car :" +car);
		
		
		
		Hashtable< String, String> Region = new Hashtable< String , String>();
		
		
		Region.put("BD" ,"Asia");
		
		Region.put("USA" ,"North America");
		
		System.out.println(" Region : " + Region.get("USA"));
		
		
		
		
	}

}
