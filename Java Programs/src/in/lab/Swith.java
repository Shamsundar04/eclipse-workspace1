package in.lab;

import java.util.Scanner;

public class Swith {

	public static void main(String[] args) {

//		enum Status{ LOADING,SUCCESS, ERROR}

//		Scanner scanner=new Scanner(System.in);
//		String language=scanner.next().toUpperCase();

//		switch (language) {
//		case "C" -> System.out.println("c");
//		case "JAVA" ->System.out.println("java");
//		default -> System.out.println("not");
//		}

//		Object input=44.4;
		//
//		String result=switch(input) {
//		
//		case String s when s.isBlank() ->"empty";
//		case String s -> "String with content "+s;
//		case Integer i when i>0 -> "Positive integer "+i;
//		case Integer i -> "Negative integer ";
//		case Double d -> "Double "+6;
//		default -> "unknown ";
//		};
//		
//		System.out.println(result);

//		String mood="starving".toLowerCase();
//		String response=switch (mood) {
//		case "happy" -> {
//			System.out.println("Your smiling");
//			yield "keep it up";
//		}		
//		
//		case "starving" ->{
//			System.out.println("Hungry");
//			yield "eat food";
//		}
//		
//		default ->{
//			System.out.println("Unclear");
//			yield "take care";
//		}
//		};
//		System.out.println(response);

//		int no=1;
//		String oddEven=switch (no%2) {
//		case 0-0 ->{
//			yield "even";
//		}
//		case 2-1 ->{
//			yield "odd";
//		}
//		default ->
//		throw new IllegalArgumentException("Unexpected value: " + no);
//		};
//		
//		System.out.println(oddEven);

//		Object n=3;
//		switch (n) {
//		case Integer i when i%2==0 -> System.out.println("Event");
//		
//		case Double d -> System.out.println("Double");
//		
//		default -> System.out.println("");
//		};	

//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		String operation = sc.next().toUpperCase();
//
//		String result = switch (operation) {
//		case "ADD" -> "Result :- " + (x + y);
//		case "SUB" -> "Result :- " + (x - y);
//		case "MUL" -> "Result :- " + (x * y);
//		case "DIV" -> {
//			if (y == 0)
//				yield "Cannot divide by zero";
//			else
//				yield "Result :- " + (x / y);
//		}
//		default -> "Invalid choice";
//		};
//
//		System.out.println(result ;

		Scanner sc = new Scanner(System.in);
		String day = sc.next().toLowerCase();

		String result = switch (day) {
		case "monday", "wednesday", "thrusday", "friday", "tuesday" -> "Weekday";
		case "saturday", "sunday" -> "Weekend";
		default -> "not a valid Day";
		};
		System.out.println(day.toUpperCase() + " is a " + result);
		
		sc.close();
	}
}
