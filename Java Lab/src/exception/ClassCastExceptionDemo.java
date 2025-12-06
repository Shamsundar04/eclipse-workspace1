package exception;



public class ClassCastExceptionDemo {
	
	public static void handleClassCastException() {
		
		try {
			
			Object obj[]= {"Hello", true, "Java"};
//			String str[]=new String[obj.length];
//			int i=0;
			for (Object object : obj) {
				String str=(String)object;
				System.out.println("Casting successful: "+str);
			}
			
		} catch (ClassCastException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		handleClassCastException();
	}
}










//import java.util.Scanner;

//
//interface Vehicle{
//	void start();
//	void speed();
//}
//
//abstract class Bus implements Vehicle{
//	
//	public void start() {
//		System.out.println("Bus engine started");
//	}
//	
//}
//
//class RedBus extends Bus{
//	
//	@Override
//	public void speed() {
//		super.start();
//		System.out.println("RedBus Speed is 120 k/m ");
//	}
//}
//
//class Volvo extends Bus{
//
//	@Override
//	public void speed() {
//		super.start();
//		System.out.println("Volvo Bus Speed 130 k/m");
//	}
//}
//
//class Driver{
//	
//	public void dirve(Vehicle vehicle) {
//		vehicle.speed();
//	}
//}
//
//public class ClassCastExceptionDemo {
//	public static void main(String[] args) {
//	
//		try {
//			
//			Scanner scn=new Scanner(System.in);
//			String name=scn.next();
//			
//			Class<?> clsName = Class.forName(name);
//			Object obj = clsName.getDeclaredConstructor().newInstance();
//			
//			if (obj instanceof Vehicle vehicle) {
//				new Driver().dirve(vehicle);
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}



////Payment interface
//interface Payment {
//	void pay(double amount);
//}
//
////Concrete payment classes
//class CreditCardPayment implements Payment {
//	@Override
//	public void pay(double amount) {
//		System.out.println("Paid " + amount + " using Credit Card");
//	}
//
//	public void validateCard() {
//		System.out.println("Validating credit card...");
//	}
//}
//
//class PaypalPayment implements Payment {
//	@Override
//	public void pay(double amount) {
//		System.out.println("Paid " + amount + " using PayPal");
//	}
//
//	public void loginPaypal() {
//		System.out.println("Logging into PayPal...");
//	}
//}
//
////Factory class
//class PaymentFactory {
//	public static Payment getPayment(String type) {
//		if (type.equalsIgnoreCase("credit")) {
//			return new CreditCardPayment();
//		} else if (type.equalsIgnoreCase("paypal")) {
//			return new PaypalPayment();
//		}
//		return null;
//	}
//}
//
////Test class
//public class ClassCastExceptionDemo {
//	public static void main(String[] args) {
//		Payment payment = PaymentFactory.getPayment("credit");
//
//		// Wrong cast! Assuming it's PaypalPayment
//		PaypalPayment paypal = (PaypalPayment) payment; // ClassCastException
//
//		paypal.loginPaypal(); // Won’t be reached
//	}
//}








