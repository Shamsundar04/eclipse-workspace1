package com.sham.nestedinnerclass;


class Outer1 {
    void outerMethod() {
        class Inner {
            void innerMethod() {
                System.out.println("Inside Local Inner Class");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer1().outerMethod();
    }
}
