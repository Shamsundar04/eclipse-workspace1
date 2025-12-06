package com.java.biconsumer;

import java.util.function.BiConsumer;

public class Biconsumer {
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> biConsumer=(x,y)->System.out.println(x+y);
		biConsumer.accept(1, 2);
	}
}
