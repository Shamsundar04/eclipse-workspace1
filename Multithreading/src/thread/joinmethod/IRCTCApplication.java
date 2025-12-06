package thread.joinmethod;

class Customer implements Runnable {
	private int availableSeat = 1;
	private int wantedSeat;

	public Customer(int wantedSeat) {
		super();
		this.wantedSeat = wantedSeat;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		// to avoid race condition
		if (availableSeat >= wantedSeat) {
			System.out.println(wantedSeat + " seat is allocated to " + name);
			availableSeat = availableSeat - wantedSeat;
		} else {
			System.err.println("Sorry!! " + name + " seat is not available");
		}
	}
}

public class IRCTCApplication {
	public static void main(String[] args) {
		Customer c1 = new Customer(1);

		Thread t1 = new Thread(c1, "Scott");
		Thread t2 = new Thread(c1, "Alen");

		t1.start();
		t2.start();
	}
}