package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWagesBuilder {

	public static void main(String[] args) {
		int FullTime = 1;
		
		Random random = new Random();
		int randomNum = random.nextInt(3);
		
		if(randomNum == FullTime) {
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
	}
}
