package com.upskill.java_3;

public class Loops {

	/*
	
	Type of Loops
	1. For Loop
	2.While Loop
	3.Do While Loop
	4.Infinite Loop
	
	*/

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //practiceForLoop();
      
     // practiceWhileLoop();
     // practiceDoWhileLoop();
     // practiceinfiniteeLoop();
      
      practiceNestedLoop();
      
      
	}
																					// For Loop = Do again and again upto 
	
		public static void practiceForLoop() {
			
			
			
			
			int i;
			
			for( i =1; i <= 10; i++) {
				
																						
				
				
				System.out.println(" For Loops Number =" + i);
				i++;
				
			}
			
			
		}
		
	public static void practiceWhileLoop() {
		
		int i = 1;
		while( i<=10) {
			
		System.out.println(" While Loop Number =" + i);
		
		   i++;                                                                             // While Loop = Do again and again upto condition match
		   																					// Initializing Variable
																							//	Setting Condition
																							//  Statement	
		   																					//  Increment or Decrement	
		   
		
		}
		
	}
		
	public static void practiceDoWhileLoop() {												//
		int i = 1;
		do {	
			System.out.println("Do While Loop Number" + i);	
			i++;		
		} while (i<=10);	
	}
	
	
	
	
	
	public static void practiceinfiniteeLoop() {
		int i = 1;
		for(i = 1; ; i++) {	
			System.out.println("For Infinite Loop Number" + i);	
					
		} 	
	}
		public static void practiceNestedLoop(){
			
			int i;
			int j;
			for(i = 1; i <= 10; i++) {
			for (j =1; j <=10; j++){
			int multificationTable = i * j;
			System.out.print(multificationTable + " ");
			
			
			}
			
			
		System.out.println(" ");

				
			
			}	
				
		
	}
	
	
	}


