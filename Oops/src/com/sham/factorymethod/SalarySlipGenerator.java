package com.sham.factorymethod;

public class SalarySlipGenerator {
	public static void main(String[] args) {

		Employee employee=new Employee("sham", 40000);
		
		SalarySlip salarySlip=CalculateSalary.calculateSlip(employee);
		System.out.println(salarySlip);
		
		
		Employee employee1=new Employee("sham", 40000);
		
		SalarySlip salarySlip1=CalculateSalary.calculateSlip(employee1);
		System.out.println(salarySlip1);
			
	}
}
