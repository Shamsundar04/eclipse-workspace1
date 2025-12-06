package thread.runnableinterface;

// Runnable by using Lambda
public class RunnableCas3 {
	public static void main(String[] args) {
		Runnable runnable=()->{
			System.out.println(Thread.currentThread().getName());
		};
		
		new Thread(runnable).start();
	}
}
