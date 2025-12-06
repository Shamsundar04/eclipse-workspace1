package hasrelationship;

public class Engine {
	
	private String model;
	private int engineCapacity;
	
	public Engine(String model, int engineCapacity) {
		super();
		
		if (engineCapacity<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		
		this.model = model;
		this.engineCapacity = engineCapacity;
	}

	public String getModel() {
		return model;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}


}
