package in.elc;

import in.blc.EmployeeBlc;

public class EmployeeElc {
	public static void main(String[] args) {
		EmployeeBlc employeeBlc=new EmployeeBlc(101, "sham", 90000);
		
		System.out.println(employeeBlc.getEmployeeNumber());
		System.out.println(employeeBlc.getEmployeeName());
		System.out.println(employeeBlc.getEmployeeSalary());
		System.out.println(employeeBlc.getRole());
	}
}
