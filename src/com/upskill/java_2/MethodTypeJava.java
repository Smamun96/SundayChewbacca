package com.upskill.java_2;

public class MethodTypeJava {

	public static int hourlyIncome = 65;
	

	public static void main(String[] args) {

		
     MethodTypeJava obj = new MethodTypeJava();
	obj.annualIncomeVoid();
	weeklyIncomeStatic();
	System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
	
}

	
	// void method
	public void annualIncomeVoid(){
	int annualIncome = hourlyIncome * 2000;
	System.out.println("My Annual Income = " + annualIncome);
	
	
	}
	
	
	// static method
	public static void weeklyIncomeStatic() {
	int WeeklyIncome = hourlyIncome * 40;
	System.out.println("My Weekly Income = " + WeeklyIncome);
	
	}
	

	// Return Type method
	public int monthlyIncomeReturn() {
	int monthlyIncome = hourlyIncome * 180;
	return monthlyIncome;
	
	
	}
}
