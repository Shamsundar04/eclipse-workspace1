package in.c_classroom;

import java.util.Scanner;

//import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		
		
//		Write a c program to check if a character is a vowel or consonant using the ternary operator.
	
		
//		char ch='a';
//		System.out.println((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')?"character":"not chracter");
		
		
		
//		for(char i=65;i<=90;i++) {
//			System.out.println(i);
//		}
		

//		int a=123;
//		System.out.println(a%10+""+(a/10)%10+""+(a/100));

		// 4) Using ternary operator write a C program for a bookstore named "BookWorld"
		// that calculates the discounted amount based on the total purchase amount.
		//
		// The store provides three types of discounts to its customers:
		// -> If the total purchase amount is less than Rs. 1000, there is no discount.
		// -> If the total purchase amount is between Rs. 1000 and Rs. 5000 (inclusive),
		// customers get a 5% discount on the total purchase amount.
		// -> If the total purchase amount is greater than Rs. 5000, customers get a 10%
		// discount on the total purchase amount.
		//
		// Sample input : purchase amount = 999
		// Sample output : total amount = 999
		//
		// Sample input : purchase amount = 2000
		// Sample output : total amount including 5% discount = 1900
		//
		// Sample input : purchase amount = 10000
		// Sample output : total amount including 10% discount = 9000

//		Scanner scanner = new Scanner(System.in);
//		float purchaseAmount = scanner.nextFloat();
//
//		float discount = (purchaseAmount >= 1000 && purchaseAmount <= 5000) ? (purchaseAmount * 5 / 100)
//				: purchaseAmount >= 5000 ? (purchaseAmount * 10 / 100) : 0;
//
//		if (discount == 0) {
//			System.out.println("Total amount : \n" + purchaseAmount);
//		} else if ((purchaseAmount >= 1000 && purchaseAmount <= 5000)) {
//			System.out.println("Total amount including 5% discount = \n" + (purchaseAmount - discount));
//		} else {
//			System.out.println("Total amount including 10% discount = \n" + (purchaseAmount - discount));
//		}
//
//		scanner.close();

//		 Write a 'C' program to print sum of first and last digit of given any 3 digit number
//		int n=123;
//		System.out.println((n%10)+(n/100));

//		 Write a C program to calculate and print the area of a square and rectangle.

//		int areaOfSquare=5;
//		areaOfSquare*=areaOfSquare;
//		System.out.println("Area of Square "+areaOfSquare);
//		
//		int length=5;
//		int breadth=4;
//		
//		int areaOfRectangle=length*breadth;
//		System.out.println("Area of Rectangle "+areaOfRectangle);

//		Without using control statments Write a java program to determine the next or previous multiple of 10 for a given two-digit number.
//		int no = 28;
//		int result=(no%10>5)? (no/10+1)*10 : (no/10*10);
//		int result = ((no % 10) / 5 + (no / 10)) * 10;
//		System.out.println(result);

//		int a=234;
//		System.out.println(a%10+""+ (a/10)%10+""+a/100);

//		Write a ternary expression to check if a number is within a range (10–50) using a ternary operator. No should not minus
//		int n = 10; 
//		String result = (n <= 0) ? "Invalid number" : (n >= 10 && n <= 50) ? n + " Number within range" : "Number is not within a range";
//		System.out.println(result);
		
//		Write a java program to find the largest among three numbers using nested ternary operators.
//		int a=10,b=20,c=30,d=40;
//		int result=(a>=b && a>=c && a>=d) ? a : (b>=a && b>=c && b>=d) ? b : (c>=a && c>=b && c>=d) ? c : d;
//		System.out.println(result);
		
//		Write a java program to determine if a character is uppercase or lowercase using the ternary operator.	
//		char ch='a';
//		System.out.println((ch>='a' && ch<='z') ? ch+" is lowercase" :  ch+" is uppercase");
		
		
//		Write a c program to check if a character is a vowel or consonant using the ternary operator.
	
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90)
		ch+=32;
		System.out.println(('a'==ch || 'e'==ch || 'i'==ch || 'o'==ch || 'u'==ch) ? ch+" is vowels" : ch+" is consonat");

//		Write a c program to determine if a year is a leap year or not using the ternary operator.
//		int year=2025;
//		System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? year+" is the leap year" : year+" is not leap year");
		
		
		sc.close();
	}
}
