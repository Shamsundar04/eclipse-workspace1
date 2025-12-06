package com.sham.overridingmallapp;

public class PrimeCustomer extends Customer {
	
    private static final double DISCOUNT_RATE = 10.0;

	
	public PrimeCustomer(String name) {
		super(name);
	
	}	
	
	public void calculateBill(double ...prices) {
		
		super.calculateBill(prices);
		
		
		
		double discount=super.getTotalCost()*DISCOUNT_RATE/100;
		double finalAmount=super.getTotalCost()-discount;
		System.out.println("Discount RS :"+discount);
		System.out.println("Final amount RS :"+finalAmount);
		
	}
}
