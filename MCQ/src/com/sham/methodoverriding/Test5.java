package com.sham.methodoverriding;


class Base {
    int value = 0;

    Base() {
        // (2)
        addValue();  
        // (3)
    }

    void addValue() {
        // (6)
        value += 10;
    }

    int getValue() {
        return value;
    }
}

class Derived extends Base {
    Derived() {
        // (4)
        addValue();  
        // (5)
    }

    void addValue() {
        // (7)
        super.addValue();  
        // (8)
        value += 30;
    }
}

public class Test5 {
    public static void main(String[] args) {
        // (1)
        Derived b = new Derived();
        // (9)
        System.out.println(b.getValue());  
    }
}
