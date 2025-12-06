package com.sham.nestedinnerclass;

class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	class Engine {
		private int horsepower;

		public Engine(int horsepower) {
			this.horsepower = horsepower;
		}
		
		void start() {
			System.out.println(model + " engine started with " + horsepower);
		}
	}
}

public class NonStaticInnerClass {

	public static void main(String[] args) {

		Car car = new Car("Audi 2025");
		Car.Engine engine = car.new Engine(1200);
		engine.start();
		
		
	}
}
