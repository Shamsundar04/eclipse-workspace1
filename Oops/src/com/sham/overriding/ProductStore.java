package com.sham.overriding;

import java.util.Scanner;

// ---------------- Abstract Product ----------------
abstract class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract double calculateTax();
    public abstract void applyDiscount(double percentage);

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct Name : " + name +
               "\nPrice        : " + price +
               "\nCategory     : " + category;
    }
}

// ---------------- Digital Product ----------------
class DigitalProduct extends Product {
    private static final double TAX_RATE = 0.05; // 5%
    private String licenseKey;

    public DigitalProduct(String name, double price, String category, String licenseKey) {
        super(name, price, category);
        this.licenseKey = licenseKey;
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = (getPrice() * percentage) / 100;
        setPrice(getPrice() - discount);
        System.out.println("Discount Applied : " + discount);
        System.out.println("New Price        : " + getPrice());
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String toString() {
        return "Digital Product :" + super.toString() +
               "\nLicense Key : " + licenseKey;
    }
}

// ---------------- Physical Product ----------------
class PhysicalProduct extends Product {
    private static final double TAX_RATE = 0.08;     // 8%
    private static final double SHIPPING_RATE = 5.0; // per kg
    private double shippingWeight;

    public PhysicalProduct(String name, double price, String category, double shippingWeight) {
        super(name, price, category);
        this.shippingWeight = shippingWeight;
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = (getPrice() * percentage) / 100;
        setPrice(getPrice() - discount);
        System.out.println("Discount Applied : " + discount);
        System.out.println("New Price        : " + getPrice());
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    public double calculateShippingCost() {
        return shippingWeight * SHIPPING_RATE;
    }

    @Override
    public String toString() {
        return "Physical Product :" + super.toString() +
               "\nShipping Weight : " + shippingWeight + " kg";
    }
}

// ---------------- Main Store ----------------
public class ProductStore {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources

            System.out.println("Select Product Type :");
            System.out.println("1. Digital Product");
            System.out.println("2. Physical Product");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            Product product = null;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Digital Product Name : ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Product Price : ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Product Category : ");
                    String category = scanner.nextLine();

                    System.out.print("Enter Product License Key : ");
                    String licenceKey = scanner.nextLine();

                    System.out.print("Enter Discount % : ");
                    double discount = scanner.nextDouble();

                    product = new DigitalProduct(name, price, category, licenceKey);

                    System.out.println("\n------ Product Details ------");
                    System.out.println(product);
                    product.applyDiscount(discount);
                    System.out.println("Tax Rs : " + product.calculateTax());
                }

                case 2 -> {
                    System.out.print("Enter Physical Product Name : ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Product Price : ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Product Category : ");
                    String category = scanner.nextLine();

                    System.out.print("Enter Product Weight (kg) : ");
                    double weight = scanner.nextDouble();

                    System.out.print("Enter Discount % : ");
                    double discount = scanner.nextDouble();

                    product = new PhysicalProduct(name, price, category, weight);

                    System.out.println("\n------ Product Details ------");
                    System.out.println(product);
                    product.applyDiscount(discount);
                    System.out.println("Tax Rs        : " + product.calculateTax());
                    System.out.println("Shipping Cost : " + ((PhysicalProduct) product).calculateShippingCost());
                }

                default -> System.out.println("Invalid Choice! Please run again.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
