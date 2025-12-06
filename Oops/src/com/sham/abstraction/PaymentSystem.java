package com.sham.abstraction;

abstract class Payment{
	
	public abstract void payment();
	
	public void receiptOfPayment() {
		System.out.println("Receipt printed");
	}
	
}

class CreditCard extends Payment{
	@Override
	public void payment() {
		System.out.println("Payment done by Credit card!!!");
		
	}	
}

class DebitCard extends CreditCard{
	@Override
	public void payment() {
		System.out.println("Payment done by Debit card!!!");		
	}	
}


public class PaymentSystem {

	public static void main(String[] args) {
		
		Payment payment=null;
		payment=new CreditCard();
		payment.payment();
		
		
	}
}
