package com.sham.shallowcopy;

// In shallow copy only one object will be created and shared to a multiple reference variables is called 
// shallow copy
            
public class Laptop {
	
	private double price;
	
	public Laptop(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	private void setPrice(double price) {
		this.price=price;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Laptop laptop=new Laptop(90000);
		Laptop laptop2=laptop;
		System.out.println(laptop.getPrice());
		laptop2.setPrice(80000);
		System.out.println(laptop2.getPrice());
		
	}
}