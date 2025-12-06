package com.sham.nestedinnerclass;

abstract class Anonymous {
	abstract void show();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Anonymous anonymous = new Anonymous() {

			@Override
			void show() {
				System.out.println("Anonymous inner class");
			}
		};

		anonymous.show();
	}
}