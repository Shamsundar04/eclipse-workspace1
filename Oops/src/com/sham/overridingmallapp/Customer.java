package com.sham.overridingmallapp;

public class Customer {
	
	protected String name;
	private double totalCost=0;
	public Customer(String name) {
		super();
		
		if(name==null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("name not be empty");
		}
		this.name = name;
	}
	
	public void calculateBill(double ...prices) {
		
		totalCost=0;
		for(double products : prices) {
			if (products<=0) {
				throw new IllegalArgumentException("can not be negative");
			}
			totalCost+=products;
		}
		System.out.println("Customer: "+name);
		System.out.println("Total cost RS : "+totalCost);
	}
	
	public double getTotalCost() {
		return totalCost;
	}
}
