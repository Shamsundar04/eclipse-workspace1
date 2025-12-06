package com.sham.hasrelationship;

class Engine
{
    void start()
    {
        System.out.println("Engine started.");
    }
}

class Car
{
    private Engine engine;
   
    Car()
    {
        engine = new Engine(); // Engine is created inside Car
    }

    void startCar()
    {
        engine.start();
        System.out.println("Car started.");
    }
}

public class CompositionExample
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.startCar();
    }
}