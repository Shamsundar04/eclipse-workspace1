package com.sham.multithreading;

//public class MultiThread implements Runnable {

//	public static void main(String[] args) throws InterruptedException {
//		Thread thread = new Thread(new MultiThread());
//		thread.start();
//		System.out.print("nit ");
//		thread.join();
//		System.out.println("google ");
//	}
//
//	@Override
//	public void run() {
//		System.out.println("NareshIT");
//	}
//}
//
////nit NareshIT
////google

//class Test extends Thread {
//	@Override
//	public void run() {
//		System.out.println("Run");
//		super.run();
//	}
//
//	@Override
//	public synchronized void start() {
//		System.out.println("Start");
//		super.start();
//	}
//}
//
//public class MultiThread {
//	public static void main(String[] args) {
//		nit();
//	}
//
//	static public void nit() {
//		Test test = new Test();
//		test.start();
//	}
//}
////Start
////Run

//public class MultiThread extends Thread
//{
//	public void run() {
//		System.out.println(Thread.currentThread().getId());
//	}
//	public static void main(String[] args) {
//		MultiThread nit = new MultiThread();
//		for(int i=0;i<10;i++)
//		{
//			nit.start();
//		}
//	}
//}
////21

//public class MultiThread extends Thread {
//	public void run() {
//		System.out.print(Thread.currentThread().getId() + " ");
//	}
//
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			MultiThread nit = new MultiThread();
//			nit.start();
//		}
//	}
//}
//// 27 29 23 24 26 28 22 21 25 30 

//public class MultiThread extends Thread {
//	public void run() {
//		System.out.print(Thread.currentThread().getId() + " ");
//	}
//
//	@Override
//	public void start() {
//		System.out.print(Thread.currentThread().getName() + " ");
//	}
//
//	public static void main(String[] args) {
//		MultiThread nit = new MultiThread();
//		for (int i = 0; i < 10; i++) {
//			nit.start();
//		}
//	}
//}
////main main main main main main main main main main 
//
//public class MultiThread extends Thread {
//	public void run() {
//		System.out.print(Thread.currentThread().getId() + " ");
//	}
//
//	@Override
//	public void start() {
//		System.out.print(Thread.currentThread().getName() + " ");
//	}
//
//	public static void main(String[] args) {
//		MultiThread nit = new MultiThread();
//		for (int i = 0; i < 10; i++) {
//			nit.run();
//		}
//	}
//}
////1 1 1 1 1 1 1 1 1 1

public class MultiThread implements Runnable {
	Thread thread;

	public MultiThread() {
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		System.out.println(thread);

	}

	public static void main(String[] args) {
		new MultiThread();
	}
}
