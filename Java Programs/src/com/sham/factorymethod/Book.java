package com.sham.factorymethod;

import java.util.Scanner;

public class Book {
	
	private String author;
	private String title;
	private double price;
	
	
	private Book(String author, String title, double price) {
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public static Book getBook(Scanner scanner) {
		
		System.out.print("Enet the author name : ");
		String author=scanner.nextLine();
		
		System.out.print("Enter the title of the book : ");
		String title=scanner.nextLine();
		
		System.out.print("Enter the price : ");
		double price=Double.parseDouble(scanner.nextLine());
		
		return new Book(author, title, price);
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	
	
}
