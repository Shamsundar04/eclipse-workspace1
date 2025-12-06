package com.java.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiconsumerMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("sham", 90);
		map.put("ram", 90);
		map.put("vishal", 92);

//		BiConsumer<String, Integer> biConsumer=(name, mark)->
//		System.out.println(name+" have "+mark);

		BiConsumer<String, Integer> biConsumer=(name, mark)->
		map.put(name, mark+5);
		map.forEach(biConsumer);
		
		BiConsumer<String, Integer> print=(name, mark)->
		System.out.println(name+" "+mark);
		map.forEach(print);
		
		
		BiConsumer<String, String> greet = (a, b) -> 
	    System.out.print("Hello " + a + " and " + b);
	
	    BiConsumer<String, String> exclaim = (a, b) -> 
	    System.out.println("! Welcome!");
	
	    greet.andThen(exclaim).accept("Alice", "Bob");
	}
}
