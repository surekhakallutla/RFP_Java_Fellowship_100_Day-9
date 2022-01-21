package com.bridgelabz.oopsPart2;

public class EmployeeWageClassMethod {
	
	
	static final int Present = 1;
	static final int Part_Time = 2;
	static final int WagePerHour = 20;
	static final int TotalWorkingDays = 20;
	static int TotalWorkingHours = 100;
	
	public static int employee()
	{
	
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
	//	System.out.println("Employee check value is "+empCheck);
		return empCheck;
	
	}
	
	public static int EmpWageMethod()
	{
		int Wage = 0;
		int WorkingHour = 0;
		int TotalEmpWage = 0;
		int Day = 0;
		int FullDayWorkingHour = 8;
		
		while( Day < TotalWorkingDays && (WorkingHour + FullDayWorkingHour) <= TotalWorkingHours)
		{
			employee();
			
			Day++;
			
			switch(employee())
			{
			case Present:
				System.out.println("Employee is Present");
				WorkingHour += FullDayWorkingHour;
				break;
			case Part_Time:
				System.out.println("Employee is Part Timer");
				WorkingHour += (FullDayWorkingHour / 2);;
				break;
			default:
				System.out.println("Employee is Absent");
				WorkingHour = 0;
			}
			
			TotalWorkingHours += WorkingHour;
			System.out.println("Day:"+Day+"\tEmp Hr:"+WorkingHour);
			
			Wage = WorkingHour * WagePerHour;
			TotalEmpWage = TotalEmpWage + Wage;
			System.out.println("Employee wage is "+ Wage);
			
		}
		
		TotalEmpWage = TotalWorkingHours * WagePerHour;
		System.out.println("Total Employee Wage is "+TotalEmpWage);
		
		return TotalEmpWage; 
	}
		
}

