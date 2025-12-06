package com.sham.factorymethod;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number projects ");
		int n=scanner.nextInt();
		scanner.nextLine();
		

		for(int i=1;i<=n;i++) {
			Book book=Book.getBook(scanner);
			System.out.println(book);
		}
		
		scanner.close();
	}
}
