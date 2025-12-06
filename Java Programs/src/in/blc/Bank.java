package in.blc;

public class Bank {

	private String customerName;
	private int accountNumber;
	private double currentBalance;

	public static String bankName = "SBI";
	public static String bankAddress = "Ameerpet,Hyderabad";
	public static int bankIFSCCode = 40042;

	public void setCustomerDeatils(String name, int accNumber, double balance) {
		customerName = name;
		accountNumber = accNumber;
		if (balance<=0) {
			System.out.println("Invalid amount");
			System.exit(1);
		}
		else {                                
			currentBalance = balance;
		}
	}

	public void withdraw(double amount) {
		if (amount <= currentBalance) {
			currentBalance -= amount;
			System.out.println("You withdraw " + amount + " Thankq");
		} else {
			System.out.println("You have insufficient balance");
		}
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Please enter valid amount");
		} else {
			currentBalance += amount;
			System.out.println("Amount deposite successfully");
		}
	}

	public void checkBalance() {
		System.out.println(currentBalance + " is currect balance ");
	}

	public String displayDetails() {
		return "Customer Details:\n" + "------------------\n" + "Customer Name   : " + customerName + "\n"
				+ "Account Number  : " + accountNumber + "\n" + "Current Balance : " + currentBalance + "\n\n"
				+ "Bank Details:\n" + "-------------\n" + "Bank Name       : " + bankName + "\n" + "Bank Address    : "
				+ bankAddress + "\n" + "IFSC Code       : " + bankIFSCCode;
	}
}
