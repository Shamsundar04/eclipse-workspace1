package com.sham.inheritance.single;

class BankAccount {
	private final String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposite(double amount) throws Exception {

		if (amount >= 0) {
			Thread.sleep(1000);
			balance += amount;
			System.out.println("Your account no is " + this.accountNumber);
			System.out.println("Deposited amount " + this.balance);
		} else {
			System.err.println("Amount must be positive");
			System.exit(9);
			
		}
	}
	
	public double getBalance() {
		return balance;
	}

}

class SavingAccount extends BankAccount {

	int interstRate;

	public SavingAccount(String accountNumber, double balance, int intrestRate) {
		super(accountNumber, balance);
		this.interstRate = intrestRate;
	}

	public void addIntrest() throws Exception {
		
		Thread.sleep(1000);

		double balance = getBalance();

		double intrest = balance * interstRate / 100;
		balance += intrest;
		System.out.println("Intrest on the bankbalance " + intrest);
		System.out.println("Your toatal amount after adding intrest " + balance);
	}
}

public class Bank {
	public static void main(String[] args) throws Exception {

		SavingAccount sAccount = new SavingAccount("876746", 4000, 5);
		sAccount.deposite(1000);
		sAccount.addIntrest();
	}
}
