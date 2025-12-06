package com.java.supplier;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

class Employee {
	public Employee() {
		System.out.println("Object is created");
	}
}

public class SupplierDemo1 {
	
	

	public static void main(String[] args) {
		
		

		Supplier<Integer> random = () -> 40 + 40;
		System.out.println(random.get());

		Supplier<String> str = () -> "Hello Supplier";
		System.out.println(str.get());

		Supplier<Integer> randomNo = () -> new Random().nextInt(100);
		System.out.println(randomNo.get());

		Supplier<LocalDate> dateSupplier = LocalDate::now;
		System.out.println("Today's date " + dateSupplier.get());

		Supplier<Employee> objectSupplier = Employee::new;
		 objectSupplier.get();
		
//		System.out.println( name());
	}
	
//	public static int name() {
//		try {
//		    return 10;
//		} finally {
//		    return 20;
//		}
//	}
}
