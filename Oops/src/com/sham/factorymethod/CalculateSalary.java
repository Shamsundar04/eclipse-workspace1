package com.sham.factorymethod;

public class CalculateSalary {
	
	public static SalarySlip calculateSlip(Employee emp) {
		
		double salary=emp.getSalary();
		
		double HRA=salary*0.20;
		double DA=salary*0.10;
		double PF=salary*0.05;
		
		double totalSalary=salary+HRA+DA+PF;
		
		
		return new SalarySlip(emp, totalSalary);	
	}
}