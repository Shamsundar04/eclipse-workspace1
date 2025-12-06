package thread.joinmethod;

//	The main purpose of the join() method is to make one thread wait for another 
//	thread to complete its execution before continuing.

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.start();
		t1.join();
//		join method make one thread wait untill complete the execution of another thread
		t2.start();

	}
}
