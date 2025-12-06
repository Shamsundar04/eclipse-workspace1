package com.sham.abstraction;
abstract class Cake {
    String flavor;

    // Instance block
    {
        System.out.println("Instance block in Abstract Cake");
    }

    // Constructor
    Cake(String flavor) {
        this.flavor = flavor;
        System.out.println("Abstract Cake constructor");
    }
    
    static {
    	System.out.println("static methods");
    }
}

class OrderedCake extends Cake {
    OrderedCake(String flavor) {
        super(flavor);   // calls parent constructor
        System.out.println("OrderedCake constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        new OrderedCake("Chocolate");
        
    }
}
