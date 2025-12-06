package com.sham.covariant;


//
//class Animal {
//    Animal getAnimal() {
//        System.out.println("Animal method");
//        return this;
//    }
//}
//
//class Dog extends Animal {
//    // After Java 5 → Allowed to return Dog (subclass of Animal)
//    @Override
//    Dog getAnimal() {
//        System.out.println("Dog method");
//        return this;
//    }
//}
//
//public class TestBefore5 {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//
//        // No explicit cast needed now
//        Dog d2 = d.getAnimal();   // directly returns Dog
//    }
//}


//class Animal {
//    Animal getAnimal() {
//        System.out.println("Animal method");
//        return this;
//    }
//}
//
//class Dog extends Animal {
//    // Before Java 5 → Must return EXACTLY Animal, not Dog
//    @Override
//    Animal getAnimal() {
//        System.out.println("Dog method");
//        return this;
//    }
//}
//
//public class TestBefore5 {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//
//        // getAnimal() returns Animal, so we must cast it
//        Animal a = d.getAnimal();
//        Dog d2 = (Dog) d.getAnimal();  // explicit casting needed
//    }
//}
