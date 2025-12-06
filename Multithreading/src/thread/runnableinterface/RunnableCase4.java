package thread.runnableinterface;

// Lambda inside the thread constructor with reference variable
public class RunnableCase4 {
	public static void main(String[] args) {
		new Thread(()->
			System.out.println(Thread.currentThread().getName())
		).start();
// Lambda inside the thread constructor without reference variable
		
//		thread.start();
	}
}
