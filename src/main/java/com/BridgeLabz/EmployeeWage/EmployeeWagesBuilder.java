package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWagesBuilder {

	public static void main(String[] args) {
		int FullTime = 1;
		int WageperHr = 20;
		int WorkingHr = 8;
		
		Random random = new Random();
		int randomNum = random.nextInt(3);
		
		if(randomNum == FullTime) {
			int DailyWage = WageperHr * WorkingHr;
			System.out.println("Employee is Present");
			System.out.println("Daily Employee Wage is : "+DailyWage);
		}
		else
			System.out.println("Employee is Absent");
	}
}
