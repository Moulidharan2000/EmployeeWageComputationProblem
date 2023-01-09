package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWagesBuilder {
	
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	
	public static void main(String[] args) {
		int WageperHr = 20;
		int WorkingHr = 8;
		int WageperHr = 20;
		int WorkingHr = 0;
		int NoofWorkingDays = 20;
		int TotalEmpWage = 0;
		int TotalHrsinMonth = 100;
		int TotalEmpHrs = 0;
		int TotalWorkingDays = 0;
		Random random = new Random();
		
		if(randomNum == FullTime) {
			int DailyWage = WageperHr * WorkingHr;
			System.out.println("Employee is Present");
			System.out.println("Daily Employee Wage is : "+DailyWage);

    		while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoofWorkingDays ) {
			
			TotalWorkingDays ++;
			int EmployeeCheck = random.nextInt(3);
		
			switch(EmployeeCheck) {
				case FullTime:
					WorkingHr = 8;
					break;
			
				case PartTime :
					WorkingHr = 4;
					break;
			
				default : 
					WorkingHr = 0;
			} 
			TotalEmpHrs += WorkingHr;
			System.out.println("Day : "+TotalWorkingDays+" , Working Hour : "+WorkingHr);
		}
		TotalEmpWage = TotalEmpHrs * WageperHr;
		System.out.println("Total Employee Working Hours : "+TotalEmpHrs);
		System.out.println("Total Employee Wage : "+TotalEmpWage);
	}
}
