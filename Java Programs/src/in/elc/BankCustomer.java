package in.elc;

import java.util.Scanner;

import in.blc.Bank;

public class BankCustomer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();

		System.out.print("Enter customer name :");
		String customerName = scanner.next();
		System.out.print("Enter account number :");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter currect balance :");
		double currentBalance = scanner.nextDouble();
		bank.setCustomerDeatils(customerName, accountNumber, currentBalance);

		System.out.println("Enter withdraw amount");
		double withdraw = scanner.nextDouble();
		bank.withdraw(withdraw);

		System.out.println("Enter Deposite amout");
		int deposite = scanner.nextInt();
		bank.deposit(deposite);

		System.out.println(bank.displayDetails());

//		Bank bank = new Bank();
//		System.out.println("Select the option what do you want");
//		System.out.println("Press 1 for Registration");
//		System.out.println("Press 2 for withdraw");
//		System.out.println("Press 3 for deposite");
//		System.out.println("Press 4 for details");
//		
//		int choice=scanner.nextInt();
//		
//		switch (choice) {
//		case 1:{
//			System.out.print("Enter customer name :");
//			String customerName = scanner.next();
//			System.out.print("Enter account number :");
//			int accountNumber = scanner.nextInt();
//			System.out.print("Enter currect balance :");
//			double currentBalance = scanner.nextDouble();
//			bank.setCustomerDeatils(customerName, accountNumber, currentBalance);
//			
//			break;
//		}
//		
//		case 2:{
//			System.out.println("Enter withdraw amount");
//			double amount=scanner.nextDouble();
//			bank.withdraw(amount);
//			break;
//		}
//		
//		case 3:{
//			System.out.println("Enter deposite amount");
//			int deposite=scanner.nextInt();
//			bank.deposit(deposite);
//			break;
//		}
//		
//		case 4:{
//			System.out.println(bank.displayDetails());
//		}
//
//		default:
//			System.out.println("Invalid input");
//		}
		
		scanner.close();
	}
}