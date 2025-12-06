package com.sham.nestedinnerclass;

class Outer {

	private int no = 12;

	class Inner {
		static double price = 200; // ✅ now it's a constant

		void show() {
			System.out.println("Inner class show method: " + no);
			System.out.println("Price constant: " + price);
		}
	}
}

public class NestedInnerClasses {
	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.show();
	}
}
