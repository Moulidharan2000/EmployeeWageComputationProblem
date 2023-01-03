package com.BridgeLabz.EmployeeWage;

import java.util.Random;

public class EmployeeWagesBuilder {

	public static void main(String[] args) {
		int FullTime = 1;
		int WageperHr = 20;
		int WorkingHr = 8;
		int PartTimeWorkingHr = 4;
		int PartTimeEmployee = 2;
		
		Random random = new Random();
		int randomNum = random.nextInt(3);
		
		if(FullTime == randomNum) {
			int DailyWage = WageperHr * WorkingHr;
			System.out.println("Employee is Present");
			System.out.println("Daily Employee Wage is : "+DailyWage);
		}
		else if(PartTimeEmployee == randomNum) {
			int PartTimeWage = PartTimeWorkingHr * WageperHr;
			System.out.println("Part Time Employee Wage is : "+PartTimeWage);
		}
		else
			System.out.println("Employee is Absent");
	}
}
