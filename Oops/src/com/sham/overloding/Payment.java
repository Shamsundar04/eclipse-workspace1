package com.sham.overloding;

public class Payment {

	private boolean validateAmount(double amount) {

		if (amount <= 0) {
			System.out.println("Error: Amount must be greater than zero.");
			return false;
		}
		return true;
	}

	private boolean validateCreditCardNumber(String cardNumber) {
		if (cardNumber.length() == 16) {
			return true;
		} else {
			System.out.println("Error: Invalid card number. It must be 16 digits.");
			return false;
		}
	}

	private String maskCardNumber(String cardNumber) {
		String lastDigits=cardNumber.substring(cardNumber.length() - 4);

		String maskNumber="";		
		for (int i = 0; i < cardNumber.length()-lastDigits.length(); i++) {
			
			maskNumber+='*';
			
			if ((i+1)%4==0) {
				maskNumber+="-";
			}
		}	
		return maskNumber+lastDigits;
	}

	public void makePayment(double amount) {

		if (this.validateAmount(amount)) {
			System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");
		}
	}

	public void makePayment(String cardHolderName, String creditCardNumber, double amount) {

		if (this.validateAmount(amount) && this.validateCreditCardNumber(creditCardNumber)) {
			System.out.println("Processing payment via Credit Card...");
			System.out.println("Card Holder: " + cardHolderName);
			System.out.println("Card Number: " + this.maskCardNumber(creditCardNumber));
			System.out.println("Amunt Paid RS: " + amount);
			System.out.println("Payment Successful!");
		}
	}

	public void makePayment(String debitCardNumber, double amount) {

		if (this.validateCreditCardNumber(debitCardNumber) && this.validateAmount(amount)) {

			System.out.println("Processing payment via Debit Card...");
			System.out.println("Card Number : " + this.maskCardNumber(debitCardNumber));
			System.out.println("Amount Paid RS : " + amount);
		}

	}

}
