package com.sham.inheritancevehicle;

public class Vehicle {

	protected String make;
	protected String model;
	protected int year;

	public Vehicle(String make, String model, int year) {

		if (year <= 0) {
			throw new IllegalArgumentException("Error invalid input");
		}

		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayDetails() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}
}
