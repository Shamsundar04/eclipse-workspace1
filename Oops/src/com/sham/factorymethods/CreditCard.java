package com.sham.factorymethods;

public class CreditCard implements Payment {

	public CreditCard() {
		System.out.println("You choose Credit card");
	}

	@Override
	public void paymentProcess() {
		System.out.println("Payment doing by credit card..");
	}
}
