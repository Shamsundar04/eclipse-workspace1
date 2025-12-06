package com.sham.overriding;

class Payment {
	public void process() {
		System.out.println("Payment processing.....");
	}
}

class CreditCard extends Payment {
	@Override
	public void process() {
		super.process();
		System.out.println("Payment processing by the credit cards");
	}
}

class NextBanking extends Payment {
	@Override
	public void process() {
		System.out.println("Paymetn processing by the Netbanking");
	}
}

public class OverridingPolymorphism {
	
	public static void main(String[] args) {
		
		Payment payment=new CreditCard();
		payment.process();
		
	}
}
