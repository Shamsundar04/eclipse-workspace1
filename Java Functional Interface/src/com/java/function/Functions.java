package com.java.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {
	public static void main(String[] args) {

//		Function<String, Integer> strLength = str -> str.length();
//		System.out.println(strLength.apply("Sham"));
//
//		Function<Integer, Integer> square = n -> n * n;
//		Function<Integer, Integer> dblValue = n -> n * 2;
//
//		Function<Integer, Integer> value = square.andThen(dblValue);
//		System.out.println(value.apply(2));

		Function<String, Boolean> palindrome = str -> {
			String string = new StringBuilder(str).reverse().toString();			
			Predicate<String> checkPalindrome = strs -> strs.equals(string);
			return checkPalindrome.test(str); 
		};
		
		
		Boolean apply = palindrome.apply("madam");
		System.out.println(apply);

		Function<Integer, Integer> cube=no->no*no*no;
		System.out.println(cube.apply(3));
	}
}