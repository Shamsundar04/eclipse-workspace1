package com.sham.payrollsystem;

public class TaxCalculation {

	public static void main(String[] args) {

		Employee e = new Employee(1, "Alice", 30000, 5000, 4000);
		Manager m = new Manager(2, "Bob", 40000, 6000, 5000, 7000);
		Trainer t = new Trainer(3, "Charlie", 25000, 4000, 3000, 5, 1000);
		Sourcing s = new Sourcing(4, "David", 20000, 3000, 2000, 50, 45, 100);
		
		System.out.println(e.idName()+"\nEmployee Gross : " + e.calculateGrossSalary() + "\nTax : "+TaxUtil.calculateTax(e));
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		
		System.out.println(m.idName()+"\nManager Gross: " + m.calculateGrossSalary() + "\nTax: " + TaxUtil.calculateTax(m));
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		
		System.out.println(t.idName()+"\nTrainer Gross: " + t.calculateGrossSalary() + "\nTax: " + TaxUtil.calculateTax(t));
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		
		System.out.println(s.idName()+"\nSourcing Gross: " + s.calculateGrossSalary() + "\nTax: " + TaxUtil.calculateTax(s));
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
	}
}
