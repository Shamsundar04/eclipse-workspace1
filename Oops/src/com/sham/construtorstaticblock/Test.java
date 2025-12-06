package com.sham.construtorstaticblock;

class Student {

	private double balance;
	public Student() {
		this("java");
		balance = 39999;
		System.out.println("No argument constructor " + balance);
	}

	public Student(String language) {
		System.out.println("language is " + language);
	}
	
	{
		balance = 1000;
		System.out.println("Static block executed " + balance);
	}

	{
		balance = 2000;
		System.out.println("Static block executed " + balance);
	}

	{
		balance = 3000;
		System.out.println("Static block executed " + balance);
	}
}

public class Test {
	public static void main(String[] args) {
		new Student();
	}
}