package in.blc;

public class Employee {

	private String employeeName;
	private long employeeNumber;
	private double employeeSalary;

	public Employee(String employeeName, long employeeNumber, double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.employeeSalary = employeeSalary;
	}

//	public void setEmployeeDetails(String employeeName, long employeeNumber, double employeeSalary) {
//		this.employeeName = employeeName;
//		this.employeeNumber = employeeNumber;
//		this.employeeSalary = employeeSalary;
//	}

	public void calculateSalaryIncrement() {
		double increment;
		if (employeeSalary <= 50000) {
			increment = employeeSalary * 0.10;
			employeeSalary += increment;
		} else if (employeeSalary >= 50000 && employeeSalary <= 80000) {
			increment = employeeSalary * 0.07;
			employeeSalary += increment;
		} else {
			increment = employeeSalary * 0.05;
			employeeSalary += increment;
		}
		System.out.println("Salary increment by " + increment);
		System.out.println("Salary after increment " + employeeSalary);
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", employeeSalary="
				+ employeeSalary + "]";
	}
}
