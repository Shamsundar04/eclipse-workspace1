
public class DeadLockDemo {

	public static void main(String[] args) {

		final Object lock1 = new Object();
		final Object lock2 = new Object();

		Thread t1 = new Thread(() -> {

			synchronized (lock1) {
				System.out.println("thread1 lock lock1");

				synchronized (lock2) {
					System.out.println("thread1 lock lock2");
				}
			}

		});

		Thread t2 = new Thread(() -> {

			synchronized (lock2) {
				System.out.println("thread2 lock lock2");

				synchronized (lock1) {
					System.out.println("thread2 lock lock1");
				}
			}

		});
		
		t1.start();
		t2.start();

	}

}
