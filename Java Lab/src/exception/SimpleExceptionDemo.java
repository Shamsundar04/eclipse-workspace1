package exception;

import java.util.Scanner;

public class SimpleExceptionDemo {
	public static void main(String[] args) {
		
		Scanner sc=null;
		try {			
		    sc=new Scanner(System.in);
		
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("You entered a = "+a+" and b = "+b );
		} catch (Exception e) {
			System.out.println("getMessage():=> "+e.getMessage());
			System.out.println("toString():=> "+e.toString());
			System.out.println("println():=> InputMismatchException occurred. Please enter only integer numberes.");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
