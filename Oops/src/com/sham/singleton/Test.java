package com.sham.singleton;


//	To ensure only one object of a class exists in the JVM.
//	To provide global access to that single object

//	Saves memory.
//	Avoids inconsistency.
//	Useful for shared resources (logger, config, DB connection, thread pool, cache, runtime).
//	So, in one line:
//	Singleton = one object, shared everywhere, single point of control.


class Singleton{
	
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton instance created");
	}
	
	public static Singleton getInstance() {
		
		if (instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}

public class Test {
	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance==instance2);
		
	}
}
