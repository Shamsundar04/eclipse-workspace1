package thread.runnableinterface;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		
		System.out.println("Main thread started!!!");
		MyThread t1=new MyThread();
		
		Thread t2=new Thread(t1);
		t2.start();
		System.out.println("Main method ended!!!");
	}
}
