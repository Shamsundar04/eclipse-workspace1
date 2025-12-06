package com.sham.multithreading;

//class MyThreadA extends Thread {

//	String s;
//
//	public void run(String s) {
//		this.s = s;
//		for (;;) {
//			System.out.println("s will be printed :" + s);
//		}
//	}
//}
//
//class MyThreadB extends Thread {
//	String t;
//
//	public void run(String t) {
//		this.t = t;
//		for (;;) {
//			System.out.println("t will be printed :" + t);
//		}
//	}
//}
//
//public class Test2 {
//	public static void main(String[] args) {
//		MyThreadA t1 = new MyThreadA();
//		MyThreadB t2 = new MyThreadB();
//		t1.start();
//		t2.start();
//
//	}
//}






//public class Test2 extends Thread {
//	public static void main(String argv[]) {
//		Test2 b = new Test2();
//		b.run();
//		b.start();
//	}
//
//	public void start() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Value of i = " + i);
//		}
//	}
//}







//public class Test2 
//{
//	public static void main(String[] args) 
//	{
//		
//	}
//	System.out.println("Hello World!");
//}





//public class Test2 {
//	public static void main(String[] args) {
//		Runnable r1 = new Runnable() {
//			public void run() {
//				try {
//					while (true) {
//						System.out.println("Hello, world!");
//						Thread.sleep(1000);
//					}
//				} catch (InterruptedException iex) {
//				}
//			}
//		};
//
//		Runnable r2 = new Runnable() {
//			public void run() {
//				try {
//					while (true) {
//						System.out.println("Goodbye, " + " Beautiful world!");
//						Thread.sleep(2000);
//					}
//				} catch (InterruptedException iex) {
//				}
//			}
//		};
//
//		Thread thr1 = new Thread(r1);
//		Thread thr2 = new Thread(r2);
//		thr1.start();
//		thr2.start();
//	}
//}









//public class Test2 extends Thread
//{
//	public static void main(String [] args)
//	{
//		System.out.println(Thread.currentThread().threadId()+" ");
//		Thread t1 = new Thread(new Test2(),"Rahul");
//		Thread t2 = new Thread(new Test2(),"Ravi");
//		Thread t3 = new Thread(new Test2(),"Puja");
//		t3.start();
//		t1.start();
//		t2.run();
//		t2.start();
//	}
//	public  void run()
//	{
//		    for(int i=0; i<2; i++)
//			System.out.println(Thread.currentThread().getName()+" I'm :"+i);
//			System.out.println("It is end of loop");
//	}
//}








class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world1");
		}
	}
}

public class Test2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("ERROR: Thread was interrupted");
		}
		System.out.println("Thread is done!");
	}
}




