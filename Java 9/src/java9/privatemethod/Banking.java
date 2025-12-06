package java9.privatemethod;

interface Payment {
	default void payByCard(String user, double amount) {
		if (!validate(user, amount))
			return;
		System.out.println("Paid " + amount + " by Card for " + user);
	}

	default void payByUPI(String user, double amount) {
		if (!validate(user, amount))
			return;
		System.out.println("Paid " + amount + " by UPI for " + user);
	}

	private boolean validate(String user, double amount) {
		if (user == null || user.isEmpty()) {
			System.out.println("Invalid payment!");
			return false;
		}

		if (amount <= 0) {
			System.out.println("Amount must be greater than 0!");
			return false;
		}
		return true;
	}
}

class Paytem implements Payment {
}

public class Banking {
	public static void main(String[] args) {

		Payment payment = new Paytem();
		payment.payByCard("", 2000);
		payment.payByUPI("shivam", -1500);
	}
}
