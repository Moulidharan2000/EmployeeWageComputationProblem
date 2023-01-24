package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWageCompute implements IEmployeeWage {

    int noOfCompanies, index;
    EmployeeWageCompute[] companies; 

    public EmployeeWageCompute(int noOfCompanies) {
        this.noOfCompanies = noOfCompanies;
        companies = new EmployeeWageCompute[noOfCompanies];
        index = 0;
    }

    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        companies[index++] = new EmployeeWageCompute(wagePerHr);
    }
  
    int companyWage(EmployeeWageCompute companyEmpWage) {
        System.out.println("* Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee:");
        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int empType = generateEmployeeType(); 
            workingHrs = getWorkingHrs(empType); 
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
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
        for (EmployeeWageCompute company : companies) 
        {
            int totalWage = companyWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company); 
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation. \n");
		EmployeeWageCompute emp = new EmployeeWageCompute(3); 
        emp.addCompany("Bridgeabz", 20, 20, 100);
        emp.addCompany("TATA", 34, 23, 130);
        emp.addCompany("BAJAJ", 10, 15, 99);
        emp.companyWage();
	}
}