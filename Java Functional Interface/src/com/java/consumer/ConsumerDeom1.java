package com.java.consumer;

import java.util.function.Consumer;

public class ConsumerDeom1 {
	
	public static void main(String[] args) {
		
		Consumer<Integer> con1=con->System.out.println(con);
		con1.accept(12);	
		
		Consumer<String> con2=upper->System.out.println(upper.toUpperCase());
		con2.accept("sham");
		
		Consumer<Float> con3=flt->System.out.println("Float value is : "+flt);
		con3.accept(99.9f);;
		
		Consumer<Boolean> con4=booltype->System.out.println("Boolean value is "+booltype);
		con4.accept(true);
	}
}
