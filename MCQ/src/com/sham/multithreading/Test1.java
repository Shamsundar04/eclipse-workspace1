package com.sham.multithreading;

//class Test extends Thread
//{
//	public void run()
//	{
//		for(int i=0; i<=10; i++)
//		{
//			System.out.println("Hello Welcome here.."+i);
//		}
//	}
//}
//class Test1 
//{
//	public static void main(String[] args) 
//	{
//		Test t = new Test();
//		t.start();
//		t.start();
//	}
//}

//class Test1
//{
//    public static void main(String []args)
//    {
//        Thread t = Thread.currentThread();
//		System.out.println(t);
//        System.out.println("Name of thread  : "+t.getName());
//		System.out.println("Id of thread  : "+t.getId());
//
//    } 
//}

//class Test1 {
//	public static void main(String args[]) {
//		new Thread() {
//			public void run() {
//				System.out.println("task one");
//			}
//		}.start();
//
//		new Thread() {
//			public void run() {
//				System.out.println("task two");
//			}
//		}.start();
//
//	}
//}

//class Test1 {
//	public static void main(String args[]) {
//		Runnable r1 = new Runnable() {
//			public void run() {
//				System.out.println("task one");
//			}
//		};
//
//		Runnable r2 = new Runnable() {
//			public void run() {
//				System.out.println("task two");
//			}
//		};
//
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//
//		t1.start();
//		t2.start();
//	}
//}

//
//class SimpleThread extends Thread {
//	public SimpleThread(String str) {
//		super(str);
//	}
//
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + " " + getName());
//
//			try {
//				sleep((int) (Math.random() * 1000));
//			} catch (InterruptedException e) {
//			}
//		}
//		System.out.println("DONE! " + getName());
//	}
//}
//
//class Test1 {
//	public static void main(String args[]) {
//		new SimpleThread("J2EE").start();
//		new SimpleThread("J2ME").start();
////		System.out.println((int)(Math.random() * 1000));
//	}
//}

//class Prime extends Thread {
//	public void run() {
//		try {
//			for (int i = 1; i <= 10; i++) {
//				if (i == 2 || i == 3 || i == 5 || i == 7) {
//					System.out.println("Prime No.= " + i);
//				}
//				Thread.sleep(500);
//			}
//		} catch (Exception e) {
//		}
//	}
//}
//
//class NotPrime extends Thread {
//	public void run() {
//		try {
//			for (int i = 1; i <= 10; i++) {
//				if (i == 4 || i == 6 || i == 8 || i == 9 || i == 10) {
//					System.out.println("Non-Prime No.= " + i);
//				}
//				Thread.sleep(500);
//			}
//		} catch (Exception e) {
//		}
//	}
//}
//
//class Test1 {
//	public static void main(String args[]) throws InterruptedException {
//		new Prime().start();
//		Thread.sleep(5000);
//		new NotPrime().start();
//	}
//}

//public class Test1 extends Thread
//{
//	static Thread t;
//	public static void main(String [] args)
//	{
//		try
//		{
//			t=new Thread(new Test1(),"Ravi");
//			t.start();
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//	public void run()
//	{
//		for(int i=1; i<5; i++)
//		{
//			try
//			{
//				System.out.print(Thread.currentThread().getName()+"");
//				t.start();
//			}
//			catch (Exception e)
//			{
//				System.out.println(" will not botther about but "+e+" happened "+i+" times");
//			}
//		}
//	}
//}

//class Test1 {
//	public static void main(String[] args) {
//		try {
//			Horse h = new Horse();
//			Thread t1 = new Thread(h, "MyHorse");
//			Thread t2 = new Thread(h, "YourHorse");
//			new Test1().go(t2);
//			t1.start();
//			t2.start();
//		} catch (Exception e) {
////			System.out.println(e);
//			e.printStackTrace();
//		}
//	}
//
//	void go(Thread t) {
//		t.start();
//	}
//
//}
//
//class Horse implements Runnable {
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + " ");
//	}
//}

//class Test1 {
//	public static void main(String[] args) {
//		try {
//			Horse h = new Horse();
//			Thread t1 = new Thread(h, "MyHorse");
//			Thread t2 = new Thread(h, "YourHorse");
//			new Test1().go(t2);
//			t1.start();
//			t2.start();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	void go(Thread t) {
//		t.start();
//	}
//
//}
//
//class Horse implements Runnable {
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + " ");
//	}
//}

class Parrot implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " ");
	}
}

class Test1 {
	static Parrot p;

	static {
		p = new Parrot();
	}

	{
		Thread t1 = new Thread(p, "Peacock");
		
		t1.start();
	}

	public static void main(String[] args) {
		new Test1();

		new Thread(new Runnable() {
			public void run() {
				
			}
		}, "Koyal").start();

		new Thread(new Parrot(), "Parrot").start();
	}

	{
		Thread t2 = new Thread(p, "Sparrow");
		t2.start();
	}

}
