package com.sham.overriding;


class Payments{
	
	public void processPayment() {
		System.out.println("Processing payment");
	}
}

class CreditCardPayment extends Payments{
	
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}

class DebitCardPayment extends Payments{
	
	@Override
	public void processPayment() {
		System.out.println( "Processing Debit Card payment");
	}
}

class UPIPayment extends Payments{
	
	@Override
	public void processPayment() {
		System.out.println("Processing UPI payment");
	}
}


public class PaymentProcessing {

	public static void main(String[] args) {
		paymentGetway(new CreditCardPayment(),new DebitCardPayment(),new UPIPayment());
	}

	static void paymentGetway(Payments ...payment){
		for(Payments p:payment) {
			p.processPayment();
		}
	}

}
