package com.bridgelabz.oopsPart2;

//Continuation of Previous Employee Wage Problem Use case-6 from Day-8 Practice Problem

public class EmployeeWage {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		System.out.println();
		EmployeeWageClassMethod EmpWage = new EmployeeWageClassMethod();
		EmpWage.EmpWageMethod("Central", 10, 4, 20);
		System.out.println("*************************************");
		EmpWage.EmpWageMethod("D-Mart", 20, 2, 10);
		
	}


}
