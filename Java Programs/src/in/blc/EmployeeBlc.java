package in.blc;

public class EmployeeBlc {
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	
	public EmployeeBlc(int employeeNumber, String employeeName, double employeeSalary) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}


	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	
	public String getRole() {
		
		if (employeeSalary==90000) {
			return "developer";
		}
		else if (employeeSalary==60000) {
			return "designer";
		} else {
			return "Tester";
		} 
	}	
}
