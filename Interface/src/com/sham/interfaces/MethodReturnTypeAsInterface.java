package com.sham.interfaces;

sealed interface PaymentInterface {
	abstract void pay(double amount);
}

non-sealed class CreditcardPayment implements PaymentInterface {
	public void pay(double amount) {
		System.out.println("paid " + amount + " by credit card");
	}
}

non-sealed class DebitcardPayment implements PaymentInterface {
	public void pay(double amount) {
		System.out.println("paid " + amount + " by debit card");
	}
}

non-sealed class Paypal implements PaymentInterface {
	public void pay(double amount) {
		System.out.println("paid " + amount + " by paypay");
	}
}

class PaymentFactory {
	
	public static PaymentInterface paymentOption(String type) {
		if (type.equalsIgnoreCase("credit")) {
			return new CreditcardPayment();
		} else if (type.equalsIgnoreCase("debit")) {
			return new DebitcardPayment();
		} else if (type.equalsIgnoreCase("paypal")) {
			return new Paypal();
		}
		return null;
	}
}

public class MethodReturnTypeAsInterface {
	public static void main(String[] args) {
		
		PaymentInterface payment=PaymentFactory.paymentOption("credit");
		payment.pay(1000);
	}
}