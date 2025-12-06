package com.java.bifunction;

import java.util.function.BiFunction;

public class Bifunction {

	public static void main(String[] args) {
	
		BiFunction<Integer, Integer, Integer>
		maxno=(x,y)->(x>y)?x:y;
		System.out.println(maxno.apply(2, 3));
		
		BiFunction<String, String, Integer> 
		length=(x,y)->x.length()+y.length();
		
		System.out.println(length.apply("sham", "sham"));
		
		
	}
}
