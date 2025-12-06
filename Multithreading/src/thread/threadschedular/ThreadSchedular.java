package thread.threadschedular;

class MyThread extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " by " + name + " thread");
		}
	}
}

public class ThreadSchedular {
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("Thread-A");
		t2.setName("Thread-B");
		t3.setName("Thread-C");

		t1.start();
		t2.start();
		t3.start();
	
	}
}
