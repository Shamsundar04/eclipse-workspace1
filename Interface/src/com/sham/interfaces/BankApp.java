package com.sham.interfaces;

interface Bank{
	double getBalance();
	void deposite(double amount);
	void withdraw(double amount);
	
}


class Customer implements Bank{
	
	private double amount;
	
	public Customer(double amount) {
		this.amount=amount;
	}

	@Override
	public void deposite(double amount) {
		if (amount<=0) {
			System.err.println("amount must be positive");
			System.exit(0);
		}
		this.amount=this.amount+amount;
		System.out.println("Before amount "+amount+" Updated amount "+this.amount);
	}

	@Override
	public void withdraw(double amount) {
		
		if (this.amount<=amount) {
			System.err.println("insufficient balance");
			System.exit(0);
		}
		this.amount=this.amount-amount;
		System.out.println("Withdraw amount : "+amount+" Updated amount : "+this.amount);
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.amount;
	}
}


public class BankApp {

	public static void main(String[] args) {
		
		Bank bank=new Customer(10000);
//		bank.deposite(500);
		bank.withdraw(8000);
		System.out.println("Current balance "+bank.getBalance());
	}

}
