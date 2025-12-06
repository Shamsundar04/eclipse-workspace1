package com.sham.inheritance.multilevel;

class Product {
	protected String pName;
	protected double pPrice;
	protected String pDescription;

	public Product(String pName, double pPrice, String pDescription) {
		this.pName = pName;
		this.pPrice = pPrice;
		this.pDescription = pDescription;
	}

	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pPrice=" + pPrice + ", pDescription=" + pDescription + "]";
	}
}

class ElectronicProduct extends Product {
	protected int warrenty;
	protected double powerUsage;

	public ElectronicProduct(String pName, double pPrice, String pDescription, int warrenty, double powerUsage) {
		super(pName, pPrice, pDescription);
		this.warrenty = warrenty;
		this.powerUsage = powerUsage;
	}

	@Override
	public String toString() {
		return "ElectronicProduct [pName=" + pName + ", pPrice=" + pPrice + ", pDescription=" + pDescription
				+ ", warrenty=" + warrenty + ", powerUsage KV=" + powerUsage + "]";
	}
}

class SmartPhone extends ElectronicProduct {
	protected String brand;

	public SmartPhone(String pName, double pPrice, String pDescription, int warrenty, double powerUsage, String brand) {
		super(pName, pPrice, pDescription, warrenty, powerUsage);
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "SmartPhone [pName=" + pName + ", pPrice=" + pPrice + ", pDescription=" + pDescription + ", warrenty="
				+ warrenty + ", powerUsage KV=" + powerUsage + ", brand=" + brand + "]";
	}
}

class ProductFactory {

	public static Product createProduct(String type) {
		switch (type.toLowerCase()) {
		case "smartphone":
			return new SmartPhone("iphone", 100000, "smart phone", 2, 37, "ios");

		case "laptop":
			return new ElectronicProduct("Dell XPS", 150000, "High-end laptop", 3, 65);

		default:
			throw new IllegalArgumentException("Unknown product type: " + type);
		}
	}
}

public class EcommerceSystem {
	public static void main(String[] args) {

		Product p1 = ProductFactory.createProduct("smartphone");
		System.out.println(p1);

		Product p2 = ProductFactory.createProduct("laptop");
		System.out.println(p2);
	}
}
