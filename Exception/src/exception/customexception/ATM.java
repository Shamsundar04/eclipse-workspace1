package exception.customexception;

import java.util.Scanner;

// ---------------------- Custom Exceptions -----------------------------

class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = 1L;
	public InsufficientFundsException(String errMessage) {
		super(errMessage);
	}
}

class InvalidAmountException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidAmountException(String errMessage) {
		super(errMessage);
	}
}

class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	public AccountNotFoundException(String errMessage) {
		super(errMessage);
	}
}

class LoanNotAllowedException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public LoanNotAllowedException(String errMessage) {
		super(errMessage);
	}
}

// ---------------------- Bank Interface -----------------------------

interface Bank {
	void deposit(double amount) throws InvalidAmountException;

	void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;

	void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;

	void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;

	double getBalance();
}

// ---------------------- BankAccount Class -----------------------------

class BankAccount implements Bank {
	private long accountNumber;
	private double balance;

	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0)
			throw new InvalidAmountException("Invalid amount. Deposit must be greater than zero.");
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if (amount <= 0)
			throw new InvalidAmountException("Invalid amount. Withdrawal must be greater than zero.");
		if (amount > balance)
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}

	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if (toAccount == null)
			throw new AccountNotFoundException("Target account not found.");
		if (amount <= 0)
			throw new InvalidAmountException("Invalid amount. Transfer must be greater than zero.");
		if (amount > balance)
			throw new InsufficientFundsException("Insufficient funds for transfer.");

		this.balance -= amount;
		toAccount.balance += amount;
		System.out.println("Deposit successful. New balance: " + this.balance);
		System.out.println("Transfer money to "+accountNumber+" number");
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if (amount <= 0)
			throw new InvalidAmountException("Invalid amount. Loan amount must be greater than zero.");

		if (amount > 50000 || this.balance < 50000)
			throw new LoanNotAllowedException(
					"Invalid operation: Loan not allowed. Either amount exceeds limit or balance is too low.");

		this.balance += amount;
		System.out.println("Loan approved. New balance: " + this.balance);
	}

	@Override
	public double getBalance() {
		return balance;
	}
}

// ---------------------- Customer Class -----------------------------

class Customer {
	private String name;
	private BankAccount account;

	public Customer(String name, BankAccount account) {
		this.name = name;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public BankAccount getAccount() {
		return account;
	}
}

// ---------------------- ATM Class -----------------------------

public class ATM {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1111, 60000);
		BankAccount acc2 = new BankAccount(2222, 3000);
		Customer customer1 = new Customer("Alice", acc1);
		Customer customer2 = new Customer("Bob", acc2);

		try (Scanner scn = new Scanner(System.in)) {

			while (true) {
				System.out.println("\nSelect an option :");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("4. Loan Application");
				System.out.println("5. Check Balance");
				System.out.println("6. Exit");

				System.out.print("Enter your option : ");
				int choice = scn.nextInt();
				scn.nextLine();

				if (choice == 6) {
					System.out.println("Thank you for using the ATM. Goodbye!");
					break;
				}

				System.out.print("Enter Customer name : ");
				String name = scn.nextLine().trim().toLowerCase();

				Customer currentCustomer = null;
				if (name.equals("alice"))
					currentCustomer = customer1;
				else if (name.equals("bob"))
					currentCustomer = customer2;
				else {
					System.out.println("Customer not found.");
					continue;
				}

				BankAccount currentAccount = currentCustomer.getAccount();

				try {
					switch (choice) {
					case 1 -> {
						System.out.print("Enter amount to deposit: ");
						double amount = scn.nextDouble();
						currentAccount.deposit(amount);
					}
					case 2 -> {
						System.out.print("Enter amount to withdraw: ");
						double amount = scn.nextDouble();
						currentAccount.withdraw(amount);
					}
					case 3 -> {
						System.out.print("Enter amount to transfer: ");
						double amount = scn.nextDouble();

						BankAccount target = (currentCustomer == customer1) ? customer2.getAccount()
								: customer1.getAccount();

						currentAccount.transfer(target, amount);
					}
					case 4 -> {
						System.out.print("Enter loan amount to apply: ");
						double amount = scn.nextDouble();
						currentAccount.applyForLoan(amount);
					}
					case 5 -> {
						System.out.println("Current balance: " + currentAccount.getBalance());
					}
					default -> System.out.println("Invalid option. Try again.");
					}
				} catch (InvalidAmountException | LoanNotAllowedException e) {
					System.out.println(e.getMessage());
				} catch (InsufficientFundsException | AccountNotFoundException e) {
					System.out.println("Transaction failed: " + e.getMessage());
				} catch (Exception e) {
					System.out.println("Unexpected error: " + e.getMessage());
				}
			}
		}
	}
}
