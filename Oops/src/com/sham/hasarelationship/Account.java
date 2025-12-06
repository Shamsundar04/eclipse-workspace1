package com.sham.hasarelationship;

public class Account {

	private double accountNo;
	private double balance;
	
	public Account(double accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
}

class Customer
{
	private String name;
	private final Account account;
	
	
	public Customer(String name,Account account) {
		super();
		this.name = name;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", account=" + account + "]";
	}
}
