package thread.userdefine;

class UserThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Child thread is running");
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
	}
}


public class CustomThread {
	public static void main(String[] args) {
		UserThread ut1=new UserThread();
		System.out.println("Main thread started!!!");
		
		System.out.println(ut1.isAlive());
		ut1.start();
		System.out.println("Main thread ended!!!");
		
				
//		UserThread ut1=new UserThread();
//		UserThread ut2=new UserThread();
//		UserThread ut3=new UserThread();
//		UserThread ut4=new UserThread();
//		UserThread ut5=new UserThread();
//		UserThread ut6=new UserThread();
//		System.out.println(Thread.currentThread().getName());
//		
//		ut1.start();
//		ut2.start();
//		ut3.start();
//		ut4.start();
//		ut5.start();
//		ut6.start();
		
		
	}
}
