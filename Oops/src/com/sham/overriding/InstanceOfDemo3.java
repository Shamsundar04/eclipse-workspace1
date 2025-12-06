package com.sham.overriding;


class Vehicle{
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class BMW extends Vehicle{
	
}

class Audi extends Vehicle{
	
}

public class InstanceOfDemo3 {

	public static void main(String[] args) {
		
		acceptCarType(new Vehicle());
	}

	static void acceptCarType(Vehicle vehicle) { // Loose coupling
		
		if (vehicle instanceof BMW) {
			System.out.println("BMW");
		}else if (vehicle instanceof Audi) {
			System.out.println("audi");
		}
		else {
			System.out.println("wrong");
		}
	}
}
