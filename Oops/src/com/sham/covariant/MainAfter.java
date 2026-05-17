//package com.sham.covariant;
//
//class Parent {
//    Parent show() {
//        System.out.println("Parent show()");
//        return this;
//    }
//}
//
//class Child extends Parent {
//    @Override
//    Child show() {   // Covariant return type
//        System.out.println("Child show()");
//        return this;
//    }
//}
//
//public class MainAfter {
//    public static void main(String[] args) {
//        Child c = new Child();
//        Child obj = c.show();  // Directly returns Child type
//
//        // No casting needed
//        System.out.println("Returned object is Child type");
//        System.out.println(obj);
//    }
//}
