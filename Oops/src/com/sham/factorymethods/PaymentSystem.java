package com.sham.factorymethods;

public class PaymentSystem {
	public static void main(String[] args) {

		try {
			Payment paymentFactory = PaymentFactory.getPaymentFactory("credit");
			paymentFactory.paymentProcess();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
	