package in.string;

import java.util.Scanner;

public class StringBuilders {

	public static void main(String[] args) {
		
//		Method										Description
//		
//		append(String str)							Adds the string at the end
//		insert(int offset, String str)				Inserts a string at the specified position
//		replace(int start, int end, String str)		Replaces characters in a range with a new string
//		delete(int start, int end)					Deletes characters from a given range
//		reverse()									Reverses the string
//		toString()									Converts the StringBuilder to a String
		

//		StringBuilder is a class in Java used to create mutable (changeable) strings. 
//		Unlike the String class, which creates immutable strings (once created,
//		they cannot be changed), StringBuilder allows you to modify the contents of the string 
//		without creating a new object every time.

//		StringBuilder sb=new StringBuilder("Hello");
//
//		sb.append(" World");
//		System.out.println(sb);
//		sb.insert(5, ",");
//		System.out.println(sb);
//		
//		sb.replace(5, 6, "");
//		System.out.println(sb);
//
//		System.out.println(sb.indexOf("d"));
		
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		
		StringBuilder result=new StringBuilder();
		
		for (int i = 0; i < name.length(); i++) {
			
			char ch=name.charAt(i);
			result.append(ch);
			result.append(ch);
		}
		
		String name1=result.toString();
		
		System.out.println(name1);
		
		scanner.close();
	}
}