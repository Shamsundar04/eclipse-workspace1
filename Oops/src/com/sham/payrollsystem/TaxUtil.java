package com.sham.payrollsystem;

public class TaxUtil {

	public static double calculateTax(Employee e) {
		double grossSalary = e.calculateGrossSalary();
		return grossSalary >= 50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}

	public static double calculateTax(Manager m) {
		double grossSalary = m.calculateGrossSalary();
		return grossSalary >= 50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}

	public static double calculateTax(Trainer t) {
		double grossSalary = t.calculateGrossSalary();
		return grossSalary >= 50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}

	public static double calculateTax(Sourcing s) {
		double grossSalary = s.calculateGrossSalary();
		return grossSalary >= 50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}
}
