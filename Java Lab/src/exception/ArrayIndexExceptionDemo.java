package exception;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {
	public static void main(String[] args) {

		Scanner sc = null;
		try {

			sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[2];
			a[0] = 10;
			a[1] = 20;
			System.out.println(a[n]);

		} catch (Exception e) {

			System.out.println("getMessage()=> " + e);
			System.out.println("toString()=> " + e.toString());
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		System.out.println("Tnk for visiting");
	}
}
