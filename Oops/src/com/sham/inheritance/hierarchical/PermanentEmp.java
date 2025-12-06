package com.sham.inheritance.hierarchical;

public class PermanentEmp extends Employee {

	protected double providentFunt;

	public PermanentEmp(int employeeId, String employeeName, double employeeSalary) {		
		super(employeeId, employeeName, employeeSalary);
		this.providentFunt = employeeSalary * 0.12;
		
		if (employeeId<=0) throw new IllegalArgumentException("Employee id must be positive");
		if (employeeName==null || employeeName.trim().isEmpty()) throw new IllegalArgumentException("Name must not be null or empty");
	}

	public void netSalary() {
		System.out.println(employeeSalary + providentFunt);
	}

	@Override
	public String toString() {
		return "PermanentEmp [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentFunt=" + providentFunt + "]";
	}
}