package com.bridgelabz.employeewage;

public class EmployeeWagesBuilder {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		CompanyEmpWage company1 = new CompanyEmpWage("Google", 20, 25, 100);
		company1.CompaniesTotalWage();
		CompanyEmpWage company2 = new CompanyEmpWage("Amazon", 25, 20, 150);
		company2.CompaniesTotalWage();
		CompanyEmpWage company3 = new CompanyEmpWage("Tata", 30, 30, 200);
		company3.CompaniesTotalWage();
	}
}
