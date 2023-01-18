package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWagesBuilder {
	
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	
	static void GoogleTotalWage(int WageperHr, int WorkingHr, int TotalEmpWage, int TotalEmpHrs, int TotalHrsinMonth,
								int TotalWorkingDays, int NoOfWorkingDays ) {
		Random random = new Random();
		while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoOfWorkingDays ) {
			TotalWorkingDays ++;
			int EmployeeCheck = random.nextInt(3);
			switch(EmployeeCheck) {
				case FULL_TIME:
					WorkingHr = 8;
					break;
			
				case PART_TIME :
					WorkingHr = 4;
					break;
		
				default : 
					WorkingHr = 0;
			} 
			TotalEmpHrs += WorkingHr;
			System.out.println("Day : "+TotalWorkingDays+" , Working Hour : "+WorkingHr);
		}
		TotalEmpWage = TotalEmpHrs * WageperHr;
		System.out.println("Google Company Employee's Total Working Hours : "+TotalEmpHrs);
		System.out.println("Google Company Employee's Total Wage : "+TotalEmpWage);
	}
	
	static void AmazonTotalWage(int WageperHr, int WorkingHr, int TotalEmpWage, int TotalEmpHrs, int TotalHrsinMonth,
								int TotalWorkingDays, int NoOfWorkingDays ) {
		Random random = new Random();
		while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoOfWorkingDays ) {
			TotalWorkingDays ++;
			int EmployeeCheck = random.nextInt(3);
			switch(EmployeeCheck) {
				case FULL_TIME:
					WorkingHr = 9;
					break;
	
				case PART_TIME :
					WorkingHr = 5;
					break;
		
				default : 
					WorkingHr = 0;
				} 
			TotalEmpHrs += WorkingHr;
			System.out.println("Day : "+TotalWorkingDays+" , Working Hour : "+WorkingHr);
		}
		TotalEmpWage = TotalEmpHrs * WageperHr;
		System.out.println("Amazon Company Employee's Total Working Hours : "+TotalEmpHrs);
		System.out.println("Amazon Company Employee's Total Wage : "+TotalEmpWage);
	}
	static void TeslaTotalWage(int WageperHr, int WorkingHr, int TotalEmpWage, int TotalEmpHrs, int TotalHrsinMonth,
							   int TotalWorkingDays, int NoOfWorkingDays ) {
	Random random = new Random();
	while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoOfWorkingDays ) {
		TotalWorkingDays ++;
		int EmployeeCheck = random.nextInt(3);
		switch(EmployeeCheck) {
			case FULL_TIME:
				WorkingHr = 10;
				break;

			case PART_TIME :
				WorkingHr = 6;
				break;
	
			default : 
				WorkingHr = 0;
			} 
			TotalEmpHrs += WorkingHr;
			System.out.println("Day : "+TotalWorkingDays+" , Working Hour : "+WorkingHr);
		}
		TotalEmpWage = TotalEmpHrs * WageperHr;
		System.out.println("Tesla Company Employee's Total Working Hours : "+TotalEmpHrs);
		System.out.println("Tesla Company Employee's Total Wage : "+TotalEmpWage);
	}
	
	public static void main(String[] args) {
		int WageperHr = 0;
		int NoOfWorkingDays = 0;
		int TotalHrsinMonth = 0;
		int WorkingHr = 0;
		int TotalEmpWage = 0;
		int TotalEmpHrs = 0;
		int TotalWorkingDays = 0;
		
		Random random = new Random();
		int company = random.nextInt(3)+1;
		switch(company) {
			case 1: WageperHr = 20;
					NoOfWorkingDays = 20;
					TotalHrsinMonth = 100;
					GoogleTotalWage(WageperHr, WorkingHr, TotalEmpWage, TotalEmpHrs,
									TotalHrsinMonth, TotalWorkingDays, NoOfWorkingDays);
					break;
					
			case 2: WageperHr = 25;
					NoOfWorkingDays = 25;
					TotalHrsinMonth = 150;
					AmazonTotalWage(WageperHr, WorkingHr, TotalEmpWage, TotalEmpHrs,
									TotalHrsinMonth, TotalWorkingDays, NoOfWorkingDays);
					break;
					
			case 3: WageperHr = 15;
					NoOfWorkingDays = 30;
					TotalHrsinMonth = 200;
					TeslaTotalWage(WageperHr, WorkingHr, TotalEmpWage, TotalEmpHrs,
									TotalHrsinMonth, TotalWorkingDays, NoOfWorkingDays);
					break;
		}
	}
}
