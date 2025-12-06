package java8.default_methods;

interface Payment {

	void pay(double amount);

	default void applyTransactionFee(double amount) {
		double fee = amount * 0.02; 
		System.out.println("Default Transaction Fee: " + fee);
	}

}

class Credit implements Payment {
	public void pay(double amount) {
		System.out.println("Paid " + amount + " amount by credit card");
	}
}


class Debit implements Payment {

	public void pay(double amount) {
		System.out.println("Paid " + amount + " amount by debit card");
	}

	public void applyTransactionFee(double amount) {
		double fees = amount * 0.50;
		System.out.println("Debit card fees " + fees);
	}
}

class UPI implements Payment {
	public void pay(double amount) {
		System.out.println("Paid " + amount + " amount by upi card");
	}
}


public class PaymentApp {
	
	public static void main(String[] args) {
		Payment debit = new Debit();
		debit.pay(2000);
		debit.applyTransactionFee(2000);
	}
}
