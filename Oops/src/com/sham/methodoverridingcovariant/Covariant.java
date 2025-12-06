package com.sham.methodoverridingcovariant;


// Co-variant return type in java means when we override a method 
// sub-class allow us to return more specific type(Sub class) instead of the parent return type.

//Parent class
class Animal {
	Animal getAnimal() { // Generic return type
		return this;
	}
	
	public void name() {
		System.out.println("eat");
	}
}

//Child class
class Dog extends Animal {
	@Override
	Dog getAnimal() { // ✅ Co-variant return type (more specific)
		return this;
	}

	void bark() {
		System.out.println("Dog is barking...");
	}
	public void name() {
		System.out.println("dog");
	}
}

public class Covariant {
	public static void main(String[] args) {
		
	Dog animal=new Dog();
	Dog dog=animal.getAnimal();
	dog.bark();
	
//	animal.name();
//	Dog dog=(Dog)animal;
//	dog.bark();

//		// ❌ Without co-variant return type (generic)
//		Animal a = new Dog();
//		Animal a2 = a.getAnimal(); // Returns Animal
////		 a2.bark(); // ❌ Compile error, must cast
//
//		Dog d1 = (Dog) a2; // ⬅️ Down-casting required
//		d1.bark(); // Works after casting
//
//		// ✅ With co-variant return type (specific)
//		Dog d2 = new Dog();
//		Dog d3 = d2.getAnimal(); // Returns Dog directly
//		d3.bark(); // No casting needed
	}
}
