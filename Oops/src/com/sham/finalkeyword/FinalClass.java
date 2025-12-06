package com.sham.finalkeyword;

final class Calculator{
	
	final String calculator;
	
	public Calculator(String calculator) {
		this.calculator=calculator;
	}
	
	int add(int a, int b) {
		return a+b;
	}
}

//class AdvanceCalculator extends Calculator{
//	
//}

public class FinalClass {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator("Simple Calculator");
		System.out.println(calculator.add(2, 4));
		
	}
}
