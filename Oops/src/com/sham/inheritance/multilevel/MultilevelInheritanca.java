package com.sham.inheritance.multilevel;

class Vechicle {

	private String brand;

	public Vechicle(String brand) {
		this.brand = brand;
		System.out.println("Vechicle brand is " + this.brand);
	}
}

class Car extends Vechicle {

	private int wheels;

	public Car(String brand, int wheels) {
		super(brand);
		this.wheels = wheels;
		System.out.println("Car constructor : wheels " + this.wheels);
	}
}

class ElectricCar extends Car {

	int batteryCapacity;

	public ElectricCar(String brand, int wheels, int batteryCapacity) {
		super(brand, wheels);
		this.batteryCapacity = batteryCapacity;

		System.out.println("Electric car constructor battery capacity " + batteryCapacity);
	}
}

public class MultilevelInheritanca {

	public static void main(String[] args) {
		new ElectricCar("tata", 4, 2999);
	}
}
