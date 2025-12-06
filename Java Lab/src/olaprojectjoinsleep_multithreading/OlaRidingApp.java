package olaprojectjoinsleep_multithreading;

class RideRequest extends Thread {
	public void run() {
		System.out.println("User requested a ride...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Searching for nearby drivers...");
	}
}

class DriverAssignmetnt extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Driver found and assigned!");
	}
}

class FareCalculation extends Thread{
	@Override
	public void run() {
		System.out.println("Calculating estimated fare...");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Estimated fare: 135.75 RS.");
	}
}

class LiveTracking extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Updating ride location... "+(i*20)+"% completed");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Ride Completed");
	}
}

class PaymentProcessing extends Thread{
	@Override
	public void run() {
		
		System.out.println("Processing payment...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Paymetnt succesful!");
	}
}

class RatingSystem extends Thread{
	@Override
	public void run() {	
		System.out.println("Requesting user rating...");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("User rated the ride: 5 star");
	}
}


public class OlaRidingApp {
	public static void main(String[] args) throws InterruptedException {
		
		try {
			
			RideRequest riderequest=new RideRequest();
			DriverAssignmetnt driverAssignmetnt=new DriverAssignmetnt();
			FareCalculation fareCalculation=new FareCalculation();
			LiveTracking liveTracking=new LiveTracking();
			PaymentProcessing paymentProcessing=new PaymentProcessing();
			RatingSystem ratingSystem=new RatingSystem();
			
			riderequest.start();
			fareCalculation.start();
		
			riderequest.join();
			fareCalculation.join();
			
			
			driverAssignmetnt.start();
			driverAssignmetnt.join();
		
			liveTracking.start();
			liveTracking.join();
			
			paymentProcessing.start();
			paymentProcessing.join();
			
			ratingSystem.start();
			
			Thread fThread=new Thread() {
				@Override
				
				public void run() {
					System.out.println("hii");
				}
			};
			
			fThread.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
