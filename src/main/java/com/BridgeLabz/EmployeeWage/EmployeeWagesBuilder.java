package com.BridgeLabz.EmployeeWage;

import java.util.Random;

public class EmployeeWagesBuilder {

	public static void main(String[] args) {
		int FullTime = 1;
		int PartTimeEmployee = 2;
		int WageperHr = 20;
		int WorkingHr = 8;
		int PartTimeWorkingHr = 4;
		int WorkingDays = 20;
		
		Random random = new Random();
		int randomNum = random.nextInt(3);
		
		switch(randomNum) {
			case 1:
				int DailyWage = WageperHr * WorkingHr;
				int WageforMonth = WorkingDays * DailyWage;
				System.out.println("Employee is Present");
				System.out.println("Daily Employee Wage is : "+DailyWage);
				System.out.println("Employee Wage for Month is : "+WageforMonth);
				break;
			
			case 2 :
				int PartTimeWage = PartTimeWorkingHr * WageperHr;
				int Wageformonth = WorkingDays * PartTimeWage;
				System.out.println("Part Time Employee Wage is : "+PartTimeWage);
				System.out.println("Monthly Wage for Part Time Employee : "+Wageformonth);
				break;
			
			default : System.out.println("Employee is Absent");
				break;
		}
	}
}
