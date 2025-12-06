package com.sham.staticnestedclass;

class Department {

	public static String deptName = "IT Department";

	public Department() {
		System.out.println("Department class constructor");
	}

	static class Employee extends Department {
		private String empName;
		private double salary;

		public Employee(String empName, double salary) {
			super();
			this.empName = empName;
			this.salary = salary;
		}

		void showDetails() {
			System.out.println(deptName + " name " + empName + " salary " + salary);
		}
	}
}

public class StaticNestedClass {
	public static void main(String[] args) {

		Department.Employee employee = new Department.Employee("Sham", 100000);
		employee.showDetails();
	}
}
