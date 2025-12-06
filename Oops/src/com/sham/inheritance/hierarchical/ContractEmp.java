package com.sham.inheritance.hierarchical;

public class ContractEmp extends Employee {
	
	protected int contractDuration;

	public ContractEmp(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
		super(employeeId, employeeName, employeeSalary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmp [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", contractDuration=" + contractDuration + "]";
	}
	
	
}
