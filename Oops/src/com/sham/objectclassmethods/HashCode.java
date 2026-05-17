package com.sham.objectclassmethods;

public class HashCode {

	public static void main(String[] args) {

//	If two objects are equal (equals() is true) → they must return the same hashCode.
//  If two objects are not equal → they can still have the same hashCode (called a collision).
//  Default hashCode() (from Object class) generates a unique value based on memory address,
//	unless overridden.

		Integer integer=65;
		String string="A";
		System.out.println(integer.hashCode());
		System.out.println(string.hashCode());

//		String string = "sh";
//		String string2 = "sh";
//		System.out.println(string.equals(string2));
//		System.out.println(string.hashCode());
//		System.out.println(string2.hashCode());

//		String str1 = "FB";
//		String str2 = "Ea";
//
//		// Checking hash codes
//		System.out.println("str1: " + str1 + ", hashCode: " + str1.hashCode());
//		System.out.println("str2: " + str2 + ", hashCode: " + str2.hashCode());
//
//		// Checking equality
//		System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
	}
}
