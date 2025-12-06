package interfacefactorymethod;

import java.util.Scanner;

public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Select your payment option : ");
			System.out.println("\t 1) Credit Card");
			System.out.println("\t 2) Debit Card\n");

			System.out.print("Please Enter your Choice : ");
			int choice = Integer.parseInt(sc.nextLine());

			Payment payment = null;

			switch (choice) {
			case 1 -> {
				payment = PaymentGateway.initiatePayment(new CreditCard());
				payment.applyDiscount();
				payment.processPayment();
			}

			case 2 -> {
				PaymentGateway.initiatePayment(new DebitCard());
			}
			default -> System.out.println("Wrong choice");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
