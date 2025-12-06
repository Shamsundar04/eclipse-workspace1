package thread.runnableinterface;

import java.lang.Thread.State;

// Anonymous inner class in thread class constructor
public class RunnableCase2 {
	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
			}
		}, "child-1");
		
		State state = thread.getState();
		System.out.println(state);
		thread.start();
	}
}
