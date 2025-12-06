package com.sham.overloding;

import java.util.Scanner;

public class PaymentProcess {

    public static void main(String[] args) {

        System.out.println("Payment Menu");
        System.out.println("Please select any one Payment Method from the Menu :");
        System.out.println("\t\t1) Payment by using Cash");				   
        System.out.println("\t\t2) Payment by using Credit Card");
        System.out.println("\t\t3) Payment by using Debit Card");
        System.out.print("Please enter your Payment choice [1/2/3]: ");

        Scanner sc = new Scanner(System.in);
        Payment payment = new Payment();
        int paymentChoice = sc.nextInt();

        switch (paymentChoice) {
            case 1: {
                System.out.print("Enter the amount you want to pay through cash: ");
                double amount = sc.nextDouble();
                payment.makePayment(amount);
                break;
            }

            case 2: {
                System.out.print("Enter your name: ");
                String name = sc.next();
                System.out.print("Enter your 16 digit Credit Card Number: ");
                String creditCardNumber = sc.next();
                System.out.print("Enter your Payment Amount: ");
                double amount = sc.nextDouble();
                payment.makePayment(name, creditCardNumber, amount);
                break;
            }
            
            case 3: {
                System.out.print("Enter your 16 digit Debit Card Number: ");
                String debitCardNumber = sc.next();
                System.out.print("Enter your Payment Amount: ");
                double amount = sc.nextDouble();
                payment.makePayment(debitCardNumber, amount);
                break;
            }
            
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close();
    }
}