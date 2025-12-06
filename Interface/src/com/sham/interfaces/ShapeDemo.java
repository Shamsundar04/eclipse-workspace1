package com.sham.interfaces;

abstract class Shape {

	abstract double getArea();
	abstract void printDetails();
}

class Rectangle extends Shape {

	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return (length * breadth);
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Reactangle");
		System.out.println("Lenght = " + this.length);
		System.out.println("Breadth = " + this.breadth);
		System.out.println("Area = " + this.getArea());
	}
}

class Circle extends Shape {

	double redius;

	public Circle(double redius) {
		this.redius = redius;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (3.14 * redius * redius);
	}

	@Override
	void printDetails() {
		System.out.println("Type = Circle");
		System.out.println("Radius = " + this.redius);
		System.out.println("Area = " + this.getArea());
	}
}

class Trangle extends Shape {

	double base;
	double height;

	public Trangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	double getArea() {
		return (0.5 * (base * height));
	}

	@Override
	void printDetails() {
		System.out.println("Type = Trangle");
		System.out.println("Base = " + this.base);
		System.out.println("Height = " + this.height);
		System.out.println("Area = " + this.getArea());
	}
}

public class ShapeDemo{
	public static void main(String[] args) {
		
//		Shape shape=new Rectangle(30.3, 45.4);
//		shape.printDetails();
		
//		Shape shape=new Circle(23.2);
//		shape.printDetails();
		
		Shape shape=new Trangle(146.2, 40.0);
		shape.printDetails();
		
	}
}