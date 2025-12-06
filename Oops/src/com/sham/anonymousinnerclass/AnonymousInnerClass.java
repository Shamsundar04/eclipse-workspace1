package com.sham.anonymousinnerclass;

interface A{
	public void m1();
}

public class AnonymousInnerClass {	
	public static void main(String[] args) {
		
		A a=new A() {
			@Override
			public void m1() {
				System.out.println("");
			}
		};
		
		a.m1();
		
	}
}
