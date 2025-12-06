package thread.runnableinterface;

// Runnable interface by using anonymouse inner class
public class RunnableCase1 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Name of the thread is : " + Thread.currentThread().getName());
			}
		};
		new Thread(runnable, "Child-1").start();
	}
}
