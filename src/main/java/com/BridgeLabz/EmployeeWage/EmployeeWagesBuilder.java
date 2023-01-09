package com.bridgelabz.employeewage;

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
		
		switch(randomNum) {
			case 1:
				int DailyWage = WageperHr * WorkingHr;
				System.out.println("Employee is Present");
				System.out.println("Daily Employee Wage is : "+DailyWage);
				break;
			
			case 2 :
				int PartTimeWage = PartTimeWorkingHr * WageperHr;
				System.out.println("Part Time Employee Wage is : "+PartTimeWage);
				break;
			
			default : System.out.println("Employee is Absent");
				break;
		}
	}
}
