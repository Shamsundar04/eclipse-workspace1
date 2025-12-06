package in.abstraction;

import java.util.Scanner;

public class HDFC extends ATM {

	private boolean isValidUser = false;
	private double balance = 10000;
	private final int correctPin = 1234;

	Scanner scanner = new Scanner(System.in);

	@Override
	void validateUser() {
		System.out.print("Enter PIN:");
		int enteredPin = scanner.nextInt();

		if (enteredPin == correctPin) {
			isValidUser = true;
			System.out.println("User validated successfully.");
		} else {
			System.out.println("Invalid PIN. Access denied.");
		}
	}

	@Override
	void withdraw() {
		
		if (!isValidUser) {
			System.out.println("Please validate user before making transactions.");
			return;
		}
		
		System.out.print("Enter withdrow amount ");
		double withdrowMoney=scanner.nextDouble();
		if (withdrowMoney <= balance) {
			balance -= withdrowMoney;
			System.out.println("Please collect your cash: ₹" + withdrowMoney);
			
			System.out.println("Do u want to check balance");
			System.out.println("If YES type Yes If no type No");
			
			String checkBalance=scanner.next();
			
			if ("yes".equals(checkBalance)) {
				checkBalance();
			}
			else {
				System.out.println("Thankq");
			}
			
		} else {
			System.out.println("Insufficient Amount");
		}
	}

	@Override
	public void checkBalance() {
		if (!isValidUser) {
			System.out.println("Please validate user before checking balance.");
		}
		else {
			System.out.println("Available balance "+balance);
		}
	}

}
