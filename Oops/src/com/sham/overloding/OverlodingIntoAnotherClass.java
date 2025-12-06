package com.sham.overloding;

class Parent {
    void show(String msg) {
        System.out.println("Parent: " + msg);
    }
}

class Child extends Parent{
	  // Overloading (different parameter list)
    void show(int number) {
        System.out.println("Child: " + number);
    }
}

// Overloading (within subclass + superclass): Same name, different parameters → decided at compile time.


public class OverlodingIntoAnotherClass {

	public static void main(String[] args) {
		
		Child child=new Child();
		child.show(1);
		child.show("hello");
		
	}

}
