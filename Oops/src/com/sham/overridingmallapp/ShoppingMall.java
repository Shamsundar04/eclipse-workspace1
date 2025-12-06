package com.sham.overridingmallapp;


import java.util.Scanner;

public class ShoppingMall {

    // Static method to generate bill
    public static void generateBill(Customer cust, double... prices) {
        cust.calculateBill(prices); // Calls the overridden method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the Customer Type to get additional Discount :");
        System.out.println("\t 1) General Customer ");
        System.out.println("\t 2) Prime Customer ");
        System.out.println("\t 3) VIP Customer ");

        System.out.print("Please enter Customer type : ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Please Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter number of Items : ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] itemPrices = new double[n];

        System.out.println("Please Enter the Item Name and Price :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ") Item Name : ");
            sc.nextLine(); 
            
            System.out.print("   Item Price : ");
            itemPrices[i] = sc.nextDouble();
            sc.nextLine();
        }

        Customer cust = null;
        
        switch (choice) {
            case 1:
                cust = new GeneralCustomer(name);
                break;
            case 2:
                cust = new PrimeCustomer(name);
                break;
            case 3:
                cust = new VIPCustomer(name);
                break;
            default:
                System.out.println("Invalid Customer type selected.");
                sc.close();
                return;
        }

        System.out.println("Welcome to Hyderabad Mall :");
        generateBill(cust, itemPrices);

        sc.close();
    }
}
