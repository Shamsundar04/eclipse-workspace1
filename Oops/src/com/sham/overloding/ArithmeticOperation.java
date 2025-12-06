package com.sham.overloding;

class Calculator{
	
	public Calculator() {
		System.out.println("Method overloding");
	}
	
	int add(int num1,int num2) {
		return num1+num2;
	}
	
 	double add(double num1, double num2) {
		return num1+num2;
	}
	
	int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	double multiplication(double num1, double num2) {
		return num1*num2;
	}
}

public class ArithmeticOperation {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println("sum of two integer "+c1.add(1, 2));
		System.out.println("sum of two double "+c1.add(10.50, 10.50));
		System.out.println("multiplication of integer "+c1.multiplication(1, 2));
		System.out.println("multiplication of double "+c1.multiplication(1.5, 1.5));
	}

}
