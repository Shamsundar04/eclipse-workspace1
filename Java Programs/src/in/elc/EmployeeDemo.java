package in.elc;

import java.util.Scanner;

import in.blc.Employee;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		Employee employee=new Employee(scanner.next(), scanner.nextLong(), scanner.nextDouble());
		employee.calculateSalaryIncrement();
		System.out.println(employee);
		
		Employee employee1=new Employee(scanner.next(), scanner.nextLong(), scanner.nextDouble());
		employee1.calculateSalaryIncrement();
		System.out.println(employee1);
		
		scanner.close();
	}
}

