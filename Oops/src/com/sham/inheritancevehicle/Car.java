package com.sham.inheritancevehicle;

public class Car extends Vehicle {

	protected int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);

		if (numberOfDoors <= 0) {
			throw new IllegalArgumentException("Error invalid input");
		}

		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println(this.numberOfDoors);
	}
}
