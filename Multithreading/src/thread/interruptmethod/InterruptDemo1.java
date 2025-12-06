package thread.interruptmethod;

class Test implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			boolean interrupted = Thread.currentThread().isInterrupted();

			System.out.println("Is Thread Interrupted :" + interrupted);
 
			try {
				Thread.sleep(1000); // isInterrupted = false
			} catch (InterruptedException e) {
				System.err.println("Child thread interrupted");
				Thread.currentThread().interrupt(); // isInterrupted = ture;
			}
		}
	}
}

public class InterruptDemo1 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Test());
		t1.start();
		t1.interrupt(); // isInterrupted = true
	}
}
