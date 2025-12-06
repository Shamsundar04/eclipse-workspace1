package exception.unchecked;

class LowBalanceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LowBalanceException(String errMessage) {
		super(errMessage);
	}
}

public class BankApp {

	private static double balance = 10000;

	public static void withdraw(double amount) {
		if (balance <= amount) {
			throw new LowBalanceException("Insufficient balance");
		} else {
			System.out.println(balance + " withdraw successfully");
		}
	}

	public static void main(String[] args) {

		try {
			withdraw(20000);
		} catch (LowBalanceException e) {
			System.out.println(e);
		}
		System.out.println("Main method ended !!!");
	}
}
