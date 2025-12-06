package com.sham.overriding;

import java.util.Scanner;

class BankAccount {

	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE = "SBIHYD876746";

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void calculateInterest() {
		System.out.println("Bank interest rate 8.9%");
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance RS : " + balance);
		System.out.println("IFSC CODE : " + BankAccount.IFSC_CODE);
	}
}

class SavingsAccount extends BankAccount {

	protected double interestRate = 4.0;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);

	}

	public void calculateInterest() {
		System.out.println(" Savings Account Interest RS : " + balance * interestRate / 100);
	}

}

class CurrentAccount extends BankAccount {
	protected double overdraftLimit = 5000.0;

	public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public void calculateInterest() {
		System.out.println("Current accounts do not earn interest.");
	}

	public void checkOverdraftLimit() {
		System.out.println("Overdraft limit RS : " + overdraftLimit);
	}
}

class FixedDepositAccount extends BankAccount {
	protected double interestRate = 6.5;
	protected int depositTerm;

	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, int depositTerm) {
		super(accountHolderName, accountNumber, balance);
		this.depositTerm = depositTerm;
	}

	public void calculateInterest() {
		System.out
				.println(" Fixed Deposit Interest for " + depositTerm + " years RS : " + balance * interestRate / 100);
	}

}

public class BankApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please select the Account Type :");
		System.out.println("        1) Saving Account");
		System.out.println("        2) Current Account");
		System.out.println("        3) Fixed Deposit Account");
		System.out.print("Please enter the type of account you want to open : [1/2/3] ");
		int choice = sc.nextInt();
		sc.nextLine(); // consume newline

		System.out.print("Enter account Holder Name : ");
		String name = sc.nextLine();

		System.out.print("Enter account Number : ");
		String accNo = sc.nextLine();

		System.out.print("Enter the Amount : ");
		double balance = sc.nextDouble();

		BankAccount account = null; // parent reference

		switch (choice) {
		case 1: // Savings Account
			account = new SavingsAccount(name, accNo, balance);
			account.displayAccountDetails();
			account.calculateInterest();
			break;

		case 2: // Current Account
			account = new CurrentAccount(name, accNo, balance);
			account.displayAccountDetails();
			account.calculateInterest();
			
			if (account instanceof CurrentAccount) {
				CurrentAccount currentAccount = (CurrentAccount) account;
				currentAccount.checkOverdraftLimit();
			}

//                ((CurrentAccount) account).checkOverdraftLimit();

			break;

		case 3: // Fixed Deposit Account
			System.out.print("Enter the deposit term [For How many years you want to deposit] : ");
			int term = sc.nextInt();
			account = new FixedDepositAccount(name, accNo, balance, term);
			account.displayAccountDetails();
			account.calculateInterest();
			break;

		default:
			System.out.println("Invalid Choice! Please select 1/2/3.");
		}

		sc.close();
	}
}