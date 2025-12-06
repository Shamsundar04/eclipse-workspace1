package com.sham.overridingmallapp;

public class GeneralCustomer extends Customer {

	public GeneralCustomer(String name) {
		super(name);

	}
	
	public void calculateBill(double ...prices) {
		super.calculateBill(prices);
		
		System.out.println("Discount: No discount for general customer.");
	}
}
