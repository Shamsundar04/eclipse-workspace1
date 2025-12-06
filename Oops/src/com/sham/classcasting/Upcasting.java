package com.sham.classcasting;

//	it is a technique through which we can assign sub class object to super class
//	reference variable to achieve runtime poly-morphism.

//	Why we use it:
//	To treat different subclass objects in a uniform way.
//	To call overridden methods of the subclass through a superclass reference.


class Animal{
	public void sleep() {
		System.out.println("generic animal sleeping here");
	}
}

class Dog extends Animal{
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}

class Cat extends Animal{
	
	@Override
	public void sleep() {
		System.out.println("cat is sleeping");
	}
}

public class Upcasting {
	public static void main(String[] args) {
		Animal a1=new Dog();
		Animal a2=new Cat();
		a1.sleep();
		a2.sleep();
	}
}