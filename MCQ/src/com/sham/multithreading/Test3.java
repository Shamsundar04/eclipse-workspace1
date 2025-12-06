package com.sham.multithreading;

//class SimpleThread extends Thread {
//	public SimpleThread(String str) {
//		super(str);
//	}
//
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + " " + getName());
//			try {
//				sleep((int) (Math.random() * 1000));
//			} catch (InterruptedException e) {
//			}
//		}
//		System.out.println("DONE! " + getName());
//	}
//}
//
//public class Test3 {
//	public static void main(String args[]) {
//		new SimpleThread("J2EE").start();
//		new SimpleThread("J2ME").start();
//	}
//}


//public class Test3 
//{
//	public static void main(String[] args) 
//	{		
//		
//		
//		try
//		{
//			Horse h = new Horse();
//			Thread t1= new Thread(h,"MyHorse");
//			Thread t2= new Thread(h,"YourHorse");
//			new Test3().go(t2);
//			t1.start(); t2.start();
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//
//		void go(Thread t)
//		{
//			t.start();
//		}		
//	
//}
//class Horse implements Runnable
//{
//	public void run()
//	{
//		System.out.println(Thread.currentThread().getName()+" ");
//	}
//}


//class Parrotc implements Runnable
//{
//	public void run()
//	{
//		System.out.println(Thread.currentThread().getName()+" ");
//	}
//}
//class Test3
//{
//	static Parrotc p;
//
//	static { p=new Parrotc();}
//
//	{Thread t1= new Thread(p,"Peacock"); t1.start();}
//
//	public static void main(String [] args)
//	{
//		new Test3();
//
//		new Thread( new Runnable()
//		{
//			public void run()
//			{
//				;
//			}
//		},"Koyal").start();
//
//		new Thread(new Parrotc(),"Parrot").start();
//	}
//
//	{
//	  Thread t2 = new Thread(p,"Sparrow");t2.start();
//	}
//}

//public class Test3 extends Thread {
//	static String sName = "good";
//
//	public static void main(String argv[]) {
//		Test3 t = new Test3();
//		t.nameTest(sName);
//
//		System.out.println(sName);
//	}
//
//	public void nameTest(String sName) {
//		sName = sName + " idea ";
//		start();
//	}
//
//	public void run() {
//		for (int i = 0; i < 4; i++) {
//			sName = sName + " " + i;
//		}
//	}
//
//}




//class MyThreads implements Runnable
//{
//	String str; //
//	MyThreads(String str)
//	{
//		this.str=str;
//	}
//	public void run()
//	{
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(str+ " : "+i);        //cut the ticket
//			try
//			{
//				Thread.sleep(200);
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//	}
//}
//public class Test3
//{
//	public static void main(String [] args)
//	{
//	MyThreads obj1 = new MyThreads("Cut the Ticket");
//	MyThreads obj2 = new MyThreads(" Show the Seat");
//
//	Thread t1 = new Thread(obj1);
//	Thread t2 = new Thread(obj2);
//
//		t1.start();
//		t2.start();
//
//	}
//}




class MyThread_ extends Thread
{
	String myName;

	MyThread_(String name)
	{
		myName = name;
	}

	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(myName);
		}
	}
}
public class Test3
{
	public static void main(String args[])
	{
		try
		{
			MyThread_ mt1 = new MyThread_("mt1");
			MyThread_ mt2 = new MyThread_("mt2");
			mt1.start();
			mt1.join();
			mt2.start();
		}
		catch(InterruptedException ex)
		{
		}
	}
}
