package com.sham.inheritance.hybrid;
//Parent class
class Vehicle {
 void vehicleType() {
     System.out.println("This is a Vehicle");
 }
}

//Car inherits Vehicle (Single Inheritance)
class Car extends Vehicle {
 void carType() {
     System.out.println("This is a Car");
 }
}

//Interface for Petrol cars
interface Petrol {
 void fuelType();
}

//Interface for Electric cars
interface EV {
 void batteryType();
}

//Hybrid Inheritance: Car + Interfaces (Petrol, EV)
class HybridCar extends Car implements Petrol, EV {

 @Override
 public void fuelType() {
     System.out.println("Runs on Petrol");
 }

 @Override
 public void batteryType() {
     System.out.println("Runs on Battery (EV)");
 }
}

//Driver class
public class TestHybridInheritance {
 public static void main(String[] args) {
     HybridCar obj = new HybridCar();

     obj.vehicleType();   // from Vehicle
     obj.carType();       // from Car
     obj.fuelType();      // from Petrol interface
     obj.batteryType();   // from EV interface
 }
}
