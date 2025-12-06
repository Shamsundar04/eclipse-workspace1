package com.sham.factorymethods;

public class PaymentFactory {

	public static Payment getPaymentFactory(String payment) {
		
		switch (payment) {
		case "debit": return new DebitCard();
		case "credit":return new CreditCard();
		default:throw new IllegalArgumentException("Unexpected value: "+payment);
		}
	}
}
