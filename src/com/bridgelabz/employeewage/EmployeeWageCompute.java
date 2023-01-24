package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeWageCompute implements IEmployeeWage {

	   int noOfCompanies, index; 
	    
	    ArrayList<CompanyEmpWage> companies; 
	    
	public EmployeeWageCompute(){
	      companies=new ArrayList<>();
	  }

	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
	    	CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
	        companies.add(company);
	    }
  
    int companyWage(CompanyEmpWage company) {
        System.out.println("* Computation of total wage of " + company.COMPANY_NAME + " employee:");
        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= company.MAX_WORKING_DAYS
                && totalWorkingHrs <= company.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int empType = generateEmployeeType(); 
            workingHrs = getWorkingHrs(empType); 
            int wage = workingHrs * company.WAGE_PER_HR;
            totalWage += wage;
            System.out.print("\n Day "+day+": Working hrs ="+workingHrs+", Total Wage ="+ wage+", Total working hour =" +totalWorkingHrs +"\n");
        }
        return totalWage;
    }
    int generateEmployeeType() {
        Random random = new Random();
        return random.nextInt(3);
    }
    int getWorkingHrs(int empType) {
        switch (empType) {
            case 1:
                return 8; 
            case 2:
                return 4; 
            default:
                return 0; 
        }
    }
    public void companyWage() {
        for (CompanyEmpWage company : companies) 
        {
            int totalWage = companyWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company); 
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation. \n");
		EmployeeWageCompute emp = new EmployeeWageCompute(); 
        emp.addCompany("GOOGLE", 20, 20, 100);
        emp.addCompany("TATA", 34, 23, 130);
        emp.addCompany("AMAZON", 10, 15, 99);
        emp.companyWage();
	}
}