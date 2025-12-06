package multithreading;

class PetrolPump {
	
	public synchronized void refilling(String carName) {
		
		System.out.println(carName+" refilling started...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(carName+" refilling completed!");
		
		notify();
	}	
}

class Car implements Runnable {
	
	private PetrolPump pump;
	private String name;
	
	public Car(String name, PetrolPump pump) {
		this.name=name;
		this.pump=pump;
	}
	
	public Car() {}

	@Override
	public void run() {
		pump.refilling(name);
	}
}

public class PetrolPumpSimulation {
	public static void main(String[] args) throws InterruptedException {
		
		PetrolPump pump=new PetrolPump();
		
		
		Thread t1=new Thread(new Car("FORD", pump));
		Thread t2=new Thread(new Car("Harrier", pump));
		Thread t3=new Thread(new Car("Punch", pump));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
