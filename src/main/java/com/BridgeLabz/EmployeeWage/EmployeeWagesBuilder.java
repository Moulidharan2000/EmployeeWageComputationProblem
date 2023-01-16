package com.bridgeLabz.employeewage;

import java.util.Random;

public class EmployeeWagesBuilder {
	
	public static final int FullTime = 1;
	public static final int PartTime = 2;
	
	static void TotalWages(int WageperHr, int WorkingHr, int TotalEmpWage, int TotalEmpHrs, int TotalHrsinMonth,
						   int TotalWorkingDays, int NoOfWorkingDays ) {
		
		Random random = new Random();
		while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoOfWorkingDays ) {
			
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
	
	public static void main(String[] args) {
		
		int WageperHr = 20;
		int WorkingHr = 0;
		int NoOfWorkingDays = 20;
		int TotalEmpWage = 0;
		int TotalHrsinMonth = 100;
		int TotalEmpHrs = 0;
		int TotalWorkingDays = 0;
		
		TotalWages(WageperHr, WorkingHr, TotalEmpWage, TotalEmpHrs, TotalHrsinMonth, TotalWorkingDays, NoOfWorkingDays);
	}
}
