package in.elc;

import java.util.Scanner;

import in.blc.Dog;

public class DogElc {

	public static void main(String[] args) {
			
		Scanner scanner=new Scanner(System.in);
		
		Dog dog=new Dog();
		System.out.println("Enter the Name of the dog");
		dog.name=scanner.next();

		System.out.println("Enter the height of the dog");
		dog.height=scanner.nextDouble();
		

		System.out.println("Enter the age of the dog");
		dog.age=scanner.nextInt();
		
		dog.getDogInformation();
		dog.sound();
		
		scanner.close();
	}

}
