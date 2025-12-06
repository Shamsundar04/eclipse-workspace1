package com.sham.nestedinnerclass;

class Account{
	
	private String usreName;
	private String accountNo;
	private double amount;
		
	public Account(String usreName, String accountNo, double amount) {
		super();
		this.usreName = usreName;
		this.accountNo = accountNo;
		this.amount = amount;
		System.out.println("Successfully constructor invoke");
	}
	
	public void showDetails() {
		System.out.println("username "+usreName);
		System.out.println("account no "+accountNo);
		System.out.println("balance "+amount);
	}
	
	class Transation{	
		
		static int fan=10;		
//		Eclipse/IntelliJ IDEA with Java 11 or older, it should throw a compile-time error.
//		Java 17+, some IDEs treat this as a constant-like static and don’t throw error (even if it’s not final).
		
		public void deposite(double deposite) {
			if (deposite<=0) {
				System.out.println("Amount must be positive");
				System.exit(0);
			}else {

				amount+=deposite;
				System.out.println(deposite+" rs successfully deposited");
			}
		}
		
		public void withdraw(double withdraw) {
			if (withdraw>=amount) {
				System.out.println("insufficient balance");
				System.exit(0);
			}else {
				amount-=withdraw;
				System.out.println(withdraw+" money successfully withdraw");
			}			
		}
		
		String getName() {
			return usreName;
		}
		
		double getBalance() {
			return amount;
		}
		
	}	
}

public class AccountMgmt {
	public static void main(String[] args) {
		
		Account account=new Account("sham", "sham1234", 10000);
		account.showDetails();
		Account.Transation transation=account.new Transation();
		transation.deposite(5000);
		transation.withdraw(2000);
		
	}
}
