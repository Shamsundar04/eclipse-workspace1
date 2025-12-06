package thread.synchronization;

class MyThread{
	public static synchronized void table(int n){
		
//		synchronized(MyThread.class){
			String name = Thread.currentThread().getName();
			System.out.println(name);
		for(int i=1;i<=10;i++){
			System.out.println(n+" * "+i+" = "+i*n);
			
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("----------------------------------");
//		}
	}
}

public class LimitationOfObjectLevelSyn{
	public static void main(String args[]) throws InterruptedException{
		
//		MyThread myThread1=new MyThread();
//		MyThread myThread2=new MyThread();
		
//		Runnable t1=new Runnable(){
//			public void run(){
//				myThread1.table(5);
//			}
//		};
	
		Thread t1=new Thread(()->MyThread.table(5));

		
//		Runnable t2=new Runnable(){
//			public void run(){
//				myThread1.table(10);
//			}
//		};
		
		
		Thread t2=new Thread(()->MyThread.table(10));
		
		
//		Runnable t3=new Runnable(){
//			public void run(){
//				myThread2.table(15);
//			}
//		};
		
		Thread t3=new Thread(()->MyThread.table(15));
		
		
		
//		Runnable t4=new Runnable(){
//			public void run(){
//				myThread2.table(20);
//			}
//		};
		
		Thread t4=new Thread(()->MyThread.table(20));
		
		
//		new Thread(t1).start();
//		new Thread(t2).start();
//		new Thread(t3).start();
//		new Thread(t4).start();

		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		t4.join();
	}
}