package com.sham.covariant;

class Parent {
    Parent show() {
        System.out.println("Parent show()");
        return this;
    }
}

class Child extends Parent {
    @Override
    Parent show() {   // Cannot return Child before Java 5
        System.out.println("Child show()");
        return this;
    }
}

public class MainBefore {
    public static void main(String[] args) {
        Parent p = new Child();
        Parent obj = p.show();  // Returns Parent type

        // Need casting to get Child-specific methods
        Child c = (Child) obj;
        System.out.println(c);
    }
}
