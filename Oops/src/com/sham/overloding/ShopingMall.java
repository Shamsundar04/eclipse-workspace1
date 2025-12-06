package com.sham.overloding;

class Payments {
    // Pay using Credit Card
    void pay(String cardNumber, String cvv, double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }

    // Pay using UPI
    void pay(String upiId, double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }

    // Pay using Cash on Delivery
    void pay(double amount) {
        System.out.println("Cash on Delivery - Amount to be paid: ₹" + amount);
    }
}

public class ShopingMall {
    public static void main(String[] args) {
        Payments payment = new Payments();

        // Different ways of paying (overloaded methods)
        payment.pay("1234-5678-9876-5432", "123", 2500.0); // Credit Card
        payment.pay("sham@upi", 1500.0);                   // UPI
        payment.pay(999.0);                                // Cash on Delivery
    }
}

