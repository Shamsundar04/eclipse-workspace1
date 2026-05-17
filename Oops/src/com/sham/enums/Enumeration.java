package com.sham.enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

enum Day{
	
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY
	
}

public class Enumeration {
	
	
	
	 static double areaOfCircle(double r) {
	        return 3.14 * r * r;
	    }

	
	
	static int factorial(int n) {
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		
		return fact;
	}

	
	static boolean isPrime(int n) {
		
		int counter=0;
		
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				counter++;
				System.out.println(counter);
			}
		}
		
		if (counter==2) {
			return true;
		}else {
			
			return false;
		}
	}
	
	public static int name() {
		return LocalDateTime.now().getMinute();
	}

	public static void main(String[] args) {
		
		String string="sham";
		String str = "";
		for(int i=string.length()-1;i>=0;i--) {
			
			str=str+string.charAt(i);
			
		}
		
		System.out.println(str);
		
		Day sunday = Day.SUNDAY;
		
		System.out.println(sunday);
		
		Enumeration.name();
//		System.out.println(name);
//		
//		System.out.println(Enumeration.factorial(8));
		
		System.out.println(Enumeration.isPrime(0));
		
		System.out.println(Enumeration.areaOfCircle(5));
	}
}
