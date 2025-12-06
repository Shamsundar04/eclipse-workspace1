package interfacefactorymethod;

public class PaymentGateway {
	
	public static Payment initiatePayment(Payment payment) {
		
		if (payment instanceof CreditCard) {
			System.out.println("Initiating Credit Card payment");
			return new CreditCard();
		}
		else if (payment instanceof DebitCard debit) {
			System.out.println("Initiating UPI payment");
			debit.applyDiscount();
			debit.processPayment();
			return new DebitCard();
		}
		return null;
		
	}

}
