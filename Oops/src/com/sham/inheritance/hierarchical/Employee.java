package com.sham.inheritance.hierarchical;

public class Employee {
	
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;
	

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
}
