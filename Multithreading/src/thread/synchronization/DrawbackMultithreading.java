package thread.synchronization;

class Customer1 {

	private double balance = 1000;

	public synchronized void withdraw(double amount) {
		if (amount <= this.balance) {
			System.out.println(amount + " amount withdraw successfully!!!");
			balance = balance - amount;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.err.println("Insufficient amount");
		}
	}
}

public class DrawbackMultithreading {
	public static void main(String[] args) throws Throwable {

		Customer1 cust = new Customer1();

		Runnable runnable = () -> cust.withdraw(1000);

		Thread sham = new Thread(runnable, "sham");
		Thread ajay = new Thread(runnable, "ajay");

		sham.start();
		ajay.start();
	}
}
