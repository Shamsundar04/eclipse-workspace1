package com.java.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		
//		Predicate<Integer> p1=age-> age>=18;
//		System.out.println("You are eligible for vote : "+p1.test(20));
//	
//		Predicate<String> p2=name->name.startsWith("S");
//		System.out.println("Your name start with S "+p2.test("Sham"));
//	
//		Predicate<String> p3=name->name.toLowerCase().equals("sham");
//		System.out.println("Your name is Sham "+p3.test("SHAM"));
//		
//		Predicate<Integer> isEven=no->no%2==0;
//		Predicate<Integer> isPositive=no->no>=0;
//		
////		and() → Combines two predicates (logical AND).
////		or() → Combines with logical OR.
////		negate() → Reverses the result.
//		Predicate<Integer> positiveInteger=isEven.and(isPositive);
	
//		System.out.println(positiveInteger.test(4));
//		System.out.println(positiveInteger.test(3));
	
		Predicate<Integer> isEven = n -> n % 2 == 0;
		Predicate<Integer> isOdd = isEven.negate();
		System.out.println(isOdd.test(5));  // true	
	}
}