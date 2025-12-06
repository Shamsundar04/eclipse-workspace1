package com.sham.variablehiding;

class Parent{
	String name="Super class variable";
}
class Child extends Parent{
	String name="Sub class";
	
	public void display() {
		System.out.println(super.name);
		System.out.println(name);
	}
}

//variable hiding means when we have same variable in super and sub class then sub class will hiding the super class 
//variable into the sub class variable

//variable shadowing means if we have instance variable and local variable with the same name then local 
//variable will hide  the instance variable inside the method
public class VariableHiding {
	public static void main(String[] args) {
		Child child=new Child();
		child.display();
	}
	
}
