package hasrelationship;

public class Car {

	private String make;
	private String model;
	private int year;
	private Engine engine;
//	private final Engine engine; 
	
	public Car(String make, String model, int year) {
		super();
		
		if (year<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.make = make;
		this.model = model;
		this.year = year;
		this.engine = new Engine("V6 Hybrid", 3000);
//		this.engine =new Engine("V6 Petrol", 4000);
	}

	@Override
	public String toString() {
		return "Car : make=" + make + ", model=" + model + ", year=" + year + ", Engine capacity =" + engine.getEngineCapacity();
	}	
}
