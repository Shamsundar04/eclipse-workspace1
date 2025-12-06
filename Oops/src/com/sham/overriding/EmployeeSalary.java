package com.sham.overriding;

import java.util.Scanner;

//Utility class for input validation
class ValidationHelper {

	public static void validateId(int id) {
		if (id <= 0) {
			throw new IllegalArgumentException("Employee ID must be positive!");
		}
	}

	public static void validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Employee name cannot be empty!");
		}
	}

	public static void validateSalary(double salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Salary can't be negative!!!");
		}
	}

	public static void validateHourlyRate(double rate) {
		if (rate <= 0) {
			throw new IllegalArgumentException("Employee hourly rate can't be zero OR Negative");
		}
	}

	public static void validateHoursWorked(int hours) {
		if (hours < 0) {
			throw new IllegalArgumentException("Employee hours of work can't be Negative");
		}
	}
}

class Employee {
	protected int id;
	protected String name;

	public Employee(int id, String name) {
		super();
		
		ValidationHelper.validateId(id);
		ValidationHelper.validateName(name);
		this.id = id;
		this.name = name;
	}

	public double calculateSalary() {
		return 0.0;
	}
}

class FullTimeEmployee extends Employee {

	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		ValidationHelper.validateSalary(salary);
		this.salary = salary;
	}

	@Override
	public double calculateSalary() {
		return salary;
	}
}

class PartTimeEmployee extends Employee {

	protected double hourlyRate;
	protected int hoursWorked;

	public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		
		ValidationHelper.validateHourlyRate(hourlyRate);
		ValidationHelper.validateHoursWorked(hoursWorked);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {

		return hourlyRate * hoursWorked;
	}
}

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t***Salary Calculation Menu***");
		System.out.println("\t\t 1) FullTime Employees ");
		System.out.println("\t\t 2) PartTime Employees  ");
		System.out.print("Please select the Employee type: ");
		int choice = sc.nextInt();

		try {
			switch (choice) {
			case 1:
				System.out.print("Enter Fulltime Employee Id :");
				int fId = sc.nextInt();
				sc.nextLine(); // consume newline
				System.out.print("Enter Fulltime Employee Name :");
				String fName = sc.nextLine();
				System.out.print("Enter the Salary :");
				double salary = sc.nextDouble();

				FullTimeEmployee fte = new FullTimeEmployee(fId, fName, salary);
				System.out.println(fte.name + " Salary is :" + fte.calculateSalary());
				break;

			case 2:
				System.out.print("Enter PartTime Employee Id :");
				int pId = sc.nextInt();
				sc.nextLine(); // consume newline
				System.out.print("Enter PartTime Employee Name :");
				String pName = sc.nextLine();
				System.out.print("Enter your hourly rate:");
				double rate = sc.nextDouble();
				System.out.print("Enter your total works hour in the month :");
				int hours = sc.nextInt();

				PartTimeEmployee pte = new PartTimeEmployee(pId, pName, rate, hours);
				System.out.println(pte.name + " Salary is :" + pte.calculateSalary());
				break;

			default:
				System.out.println("Invalid choice! Please select 1 or 2.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
