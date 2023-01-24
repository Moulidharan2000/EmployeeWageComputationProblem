package com.bridgelabz.employeewage;

interface IEmployeeWage {
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);
    public void companyWage();
}
public class CompanyEmpWage {

	static String COMPANY_NAME = "";
    int WAGE_PER_HR = 0;
    int MAX_WORKING_DAYS = 0;
    int MAX_WORKING_HRS = 0;
    int totalEmpWage;

    public  CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalEmpWage = 0;
    }
    void setTotalEmployeeWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    public String toString() {
        System.out.println("                                                             ");
        System.out.println("* Total Information of " + COMPANY_NAME + " employee");
        System.out.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage in a month for " + COMPANY_NAME + " Company is " + totalEmpWage + "\n";
	}
}
