package com.java.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

record Customer(String name, String email) {}

public class ConsumerRealExample {
	public static void main(String[] args) {
		
		List<Customer> customers=Arrays.asList(
				new Customer("Sham", "sham@gmail.com"),
				new Customer("vishal", "vishal@gmail.com"),
				new Customer("Ganesh", "ganesh@gmail.com")
				);
		
//		Consumer to send Email
        Consumer<Customer> sendEmail = c -> 
            System.out.println("Sending email to " + c.name() + " at " + c.email());

        // Consumer to send SMS
        Consumer<Customer> sendSMS = c -> 
            System.out.println("Sending SMS to " + c.name());

        // Chain Consumers (first email, then SMS)
        Consumer<Customer> notifyCustomer = sendEmail.andThen(sendSMS);

        // Apply action for each customer
        customers.forEach(notifyCustomer);
	}
}
