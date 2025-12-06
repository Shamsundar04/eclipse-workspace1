package exception.customexception;

//import java.util.Scanner;

class CarStoppedException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public CarStoppedException(String errMessange) {
		super(errMessange);
	}	
}



class CarPunctureException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public CarPunctureException(String errMessage) {
		super(errMessage);
	}
}



class CarHeatException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public CarHeatException(String errMessage) {
		super(errMessage);
	}
}

class CarTest{
	
	public static void stop(String msg)throws CarStoppedException {
		if (msg.equals("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		}
		else {
			System.out.println("Car not stalled.");
		}
	}
	
	public static void puncture(String msg)throws CarPunctureException {
		if (msg.equalsIgnoreCase("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		}
		else {
			System.out.println("Car not punctured.");
		}
	}

	public static void carHeat(int heat) throws CarHeatException {
		if (heat>=50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		else {
			System.out.println("Car temperature normal.");
		}
	}
}

public class CarCustomException {	

	public static void main(String[] args) {
	    
//		Scanner scn=new Scanner(System.in);
//		try {
//			System.out.print("Stop Method ");
//			String stopMethod=scn.next();
//			CarTest.stop(stopMethod);			
//		} 
//		catch (CarStoppedException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			System.out.print("Puncture Method ");
//			String punctureMethod=scn.next();
//			CarTest.puncture(punctureMethod);			
//		}
//		catch (CarPunctureException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			
//			System.out.print("Heat Method ");
//			int heatMethd=scn.nextInt();
//			CarTest.carHeat(heatMethd);
//			
//		} catch (CarHeatException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			 CarTest.stop("go");
			 CarTest.stop("stop");
		} catch (CarStoppedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			CarTest.puncture("move");
			CarTest.puncture("puncture");
		} catch (CarPunctureException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			CarTest.carHeat(40);
			CarTest.carHeat(60);
		} catch (CarHeatException e) {
			System.out.println(e.getMessage());
		}
	}
}
