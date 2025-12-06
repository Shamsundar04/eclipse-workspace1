package in.encapsulation;

class Account{
	
	private double balance=10000;
	
	public void deposite(double balance) {
		this.balance=balance;
		
		if (balance<=0) {
			System.out.println("invalid amount");
		}
		else {
			balance+=balance;
			System.out.println("Total amount after deposite "+balance);
		}
	}
	
	public void withdraw(double amount) {

		if (amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println("Withdrow "+amount);
			System.out.println("Remaining amount "+balance);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public double checkBalance() {
		return balance;
	}
}


public class BankAccount {
	
	public static void main(String[] args) {
		Account account=new Account();
//		account.deposite(10000);
//		account.withdraw(1000);
		System.out.println("balance "+account.checkBalance());
	}
}
