package com.sham.overloding;

class Bank{
	
	void deposite(double amount) {
		System.out.println(amount+" amount deposite succesfully ");
	}
	
	void deposite(String cheque, double amount) {
		System.out.println(amount+" deposited successfully via "+cheque);
	}
	
	void deposite(String accountNumber, String ifsc, double amount) {
        System.out.println("Deposited ₹" + amount + " via online transfer to A/C: " + accountNumber);
    }
}

public class BankDemo {
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.deposite(10000);
		bank.deposite("5216712Mgb", "13124Sbi", 1000);
		bank.deposite("CHQ12345", 10000.0);   
	}
}
