package com.sham.inheritance.multiple;

//Multiple Inheritance is a situation where a sub class wants to inherit
//the properties two or more than two super classes.
//In every constructor we have super() or this() to the first line.
//When compiler will add super() to the first line of the constructor 
//then we have an ambiguity issue that super() will call which super class constructor as shown in the diagram
//It is also known as Diamond Problem in java so the final conclusion is we can't achieve multiple
//inheritance using classes but same we can achieve by using interface [interface does not contain any constructor]

public class MultipleInheritance {
	
	public static void main(String[] args) {
		C c=new C();
		c.aMethod();
		c.bMethod();
	}
}
