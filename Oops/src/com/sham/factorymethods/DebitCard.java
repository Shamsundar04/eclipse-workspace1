package com.sham.factorymethods;

public class DebitCard implements Payment {
	
	public DebitCard() {
		System.out.println("You choose Debit Card");
	}
	
	@Override
	public void paymentProcess() {
		System.out.println("payment doing by the Debit card");
		
	}
}
