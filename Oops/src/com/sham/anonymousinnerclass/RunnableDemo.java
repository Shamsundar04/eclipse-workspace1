package com.sham.anonymousinnerclass;

public class RunnableDemo {

	public static void main(String[] args) {
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("anonymous class is running");
			}
		};

		new Thread(runnable).start();
	}
}