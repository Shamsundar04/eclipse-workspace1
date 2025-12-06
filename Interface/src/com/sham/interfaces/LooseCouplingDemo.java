package com.sham.interfaces;

sealed interface Payment permits CreditCard, DebitCard {
	public void pay();
}

final class CreditCard implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment done by the credit card!!!");
	}
}

final class DebitCard implements Payment {
	
	@Override
	public void pay() {
		System.out.println("Payment done by the debit card!!!");
	}
}


final class Shop{
	
	private Payment payment;
	
	public Shop(Payment payment) {
		this.payment=payment;
	}
	
	public void completePayment() {
		payment.pay();
	}
}

public class LooseCouplingDemo {
	public static void main(String[] args) {
		Shop shop=new Shop(new CreditCard());
		shop.completePayment();
		
		shop=new Shop(new DebitCard());
		shop.completePayment();
	}
}
