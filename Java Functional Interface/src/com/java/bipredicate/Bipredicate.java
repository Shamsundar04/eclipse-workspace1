package com.java.bipredicate;


import java.util.function.BiPredicate;

public class Bipredicate {

	public static void main(String[] args) {
		
//		BiPredicate<Integer, Integer> bi1=(x,y)->(x+y)%2==0;
//		System.out.println(bi1.test(2, 4));
//		
//		BiPredicate<String, Integer> bi2=(x, y)->x.length()==y;
//		System.out.println(bi2.test("hello", 5));
		
		BiPredicate<String, String> bi3=(username, password)->
		username.equals("sham") && password.equals("sham1234");
		
		System.out.println(bi3.test("sham", "sham1234"));
		
		BiPredicate<String, String> bi4=(str, sub)->str.toLowerCase().contains(sub.toLowerCase());
		System.out.println(bi4.test("ShAm", "aM"));
	}
}