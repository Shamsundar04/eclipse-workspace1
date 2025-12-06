package thread.deadlock;

class Resource {
	void printMessage() {
		System.out.println(Thread.currentThread().getName() + " is executing...");
	}
}

public class DeadlockExample {
	public static void main(String[] args) {
		final Resource resource1 = new Resource();
		final Resource resource2 = new Resource();

		Thread t1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: Locked resource 1");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}

				synchronized (resource2) {
					System.out.println("Thread 1: Locked resource 2");
					resource1.printMessage();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 2: Locked resource 2");

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}

				synchronized (resource2) {
					System.out.println("Thread 2: Locked resource 1");
					resource2.printMessage();
				}
			}
		});

		t1.start();
		t2.start();
	}
}
