package com.sham.nonstaticblock;
/*
	What is it?
	A non-static block is a block of code inside a class, 
	not inside any method or constructor, and without the static keyword.
	
		Key Interview Points
	✅ Runs before constructor — but after default value assignment.
	✅ Executes in order if multiple blocks exist.
	✅ Can initialize or modify instance variables.
	✅ Executes every time you create an object.
	✅ Can access this because the object is already being constructed.
	✅ Rarely used in real projects — mostly seen in:
	
	Initializing instance variables with complex logic.
	
	Shared initialization for multiple constructors.
*/
public class Employee {

	int age=21;
	
	{
		age=22;
	}
	
	{
		age=20;
	}
	
	{
		age=24;
	}

	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		System.out.println(emp.age);
		
		new Employee();
	}
}
