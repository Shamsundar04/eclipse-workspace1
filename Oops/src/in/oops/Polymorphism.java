package in.oops;

class Animal {
	public void sound() {
		System.out.println("Animal make a sound");
	}
}

class Dog extends Animal {

	@Override
	public void sound() {
		super.sound();
		System.out.println("Dog Bark ");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

//		Animal a=new Dog(); // Upcasting means casting subclass object into a superclass reference
//		a.sound();

		Animal a = new Dog(); // Upcasting

		if (a instanceof Dog) {  //Downcasting means casting superclass reference into a subclass object
			Dog dog = (Dog) a;
			dog.sound();
		}
	}
}
