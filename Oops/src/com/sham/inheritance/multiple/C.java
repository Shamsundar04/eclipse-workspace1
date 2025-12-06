package com.sham.inheritance.multiple;

public class C implements A,B {

	@Override
	public void bMethod() {
		System.out.println(" b class method");	
	}

	@Override
	public void aMethod() {		
		System.out.println(" a class method");
	}
}


