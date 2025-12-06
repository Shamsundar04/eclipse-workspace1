package com.sham.factorymethod;

public class SalarySlip {

	private Employee employee;
	private double totalSalary;

	public SalarySlip(Employee employee, double totalSalary) {
		super();
		this.employee = employee;
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "SalarySlip [" + employee + ", totalSalary=" + totalSalary + "]";
	}
}