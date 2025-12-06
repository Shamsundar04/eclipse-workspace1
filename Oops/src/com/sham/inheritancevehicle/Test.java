package com.sham.inheritancevehicle;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			Car car=new Car("Audi", "Q8", 2021, 4);
			System.out.println("Car Details :");
			car.displayDetails();
			
			System.out.println();
			
            Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
            System.out.println("\nBike Details");
            bike.displayDetails();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
