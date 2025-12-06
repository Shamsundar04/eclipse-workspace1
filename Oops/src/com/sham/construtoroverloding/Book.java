package com.sham.construtoroverloding;

public class Book {

	private String bookName;
	private String authorName;
	private double price = 0.0;

	public Book(String bookName, String authorName) {
		System.out.println("Constructer one");
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public Book(String bookName, String authorName, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Book name : "+this.bookName+" "+"\nBook author name : "+this.authorName+"\nBook price :"+price);
	}

	public static void main(String[] args) {
		
		Book book=new Book("java", "gosling");
		book.display();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		Book book2=new Book("c", "dennis ritchi", 1232);
		book2.display();
	}
}
