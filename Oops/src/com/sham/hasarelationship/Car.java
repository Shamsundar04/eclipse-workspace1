package com.sham.hasarelationship;

public class Car {

	private String name;
	private int model;
	private Engine engine;	// Has a relation
	
	public Car(String name, int model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine=engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
	}
}
