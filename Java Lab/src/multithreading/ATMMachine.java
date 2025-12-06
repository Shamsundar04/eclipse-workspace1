package multithreading;

class Account {

	private int balance = 0;
	
	

	public synchronized void withdraw(int amount) {

		while (balance < amount) {

			System.out.println("Insufficient balance waiting for deposite");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		this.balance = balance - amount;
		System.out.println("After withdrawing balance " + this.balance);
		
	}

	public synchronized void deposit(int amount) {

		this.balance = this.balance + amount;
		System.out.println("Updated amount after deposite " + this.balance);
		notify();

	}
}

class Drawer extends Thread {
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {

		int withdrawals[] = { 1000, 2000, 3000 };

		for (int amount : withdrawals) {

			account.withdraw(amount);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Depositor extends Thread {

	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {

		int depositor[] = { 2000, 2000, 2000 };

		for (int amount : depositor) {
			account.deposit(amount);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class ATMMachine {
	public static void main(String[] args) {
		Account account = new Account();
		Drawer drawer = new Drawer(account);
		drawer.start();
		Depositor depositor = new Depositor(account);
		depositor.start();
	}
}
