<<<<<<< HEAD
package com.bridgeLabz.employeewage;
=======
package com.bridgelabz.employeewage;
>>>>>>> 7b7657db74ddff808728b00ae2151a23974c0b98

import java.util.Random;

public class EmployeeWagesBuilder {
	
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	
<<<<<<< HEAD
	static void TotalWages(int WageperHr, int WorkingHr, int TotalEmpWage, int TotalEmpHrs, int TotalHrsinMonth,
						   int TotalWorkingDays, int NoOfWorkingDays ) {
		
=======
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
>>>>>>> 7b7657db74ddff808728b00ae2151a23974c0b98
		Random random = new Random();
		while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoOfWorkingDays ) {
			
		TotalWorkingDays ++;
		int EmployeeCheck = random.nextInt(3);
		
<<<<<<< HEAD
		switch(EmployeeCheck) {
			case FullTime:
				WorkingHr = 8;
				break;
=======
		if(randomNum == FullTime) {
			int DailyWage = WageperHr * WorkingHr;
			System.out.println("Employee is Present");
			System.out.println("Daily Employee Wage is : "+DailyWage);

    		while (TotalEmpHrs <= TotalHrsinMonth && TotalWorkingDays < NoofWorkingDays ) {
>>>>>>> 7b7657db74ddff808728b00ae2151a23974c0b98
			
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
