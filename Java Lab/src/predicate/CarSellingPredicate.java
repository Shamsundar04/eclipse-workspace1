package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

record Car(String brand, Double price, Integer mileage) {
}

public class CarSellingPredicate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String carName = sc.next();
		Double carPrice = sc.nextDouble();
		Integer carMileage = sc.nextInt();

		Car car = new Car(carName, carPrice, carMileage);

		Predicate<Car> carPredicate = (c) -> c.price() <= 500000 && c.mileage() >= 20;

		System.out.println("Enter the brand name of the Car :" + carName);
		System.out.println("Enter the price of the Car :" + carPrice);
		System.out.println("Enter the mileage of the Car :" + carMileage);

		if (carPredicate.test(car)) {
			System.out.println(carName + " is eligible for sale");
		} else {
			System.out.println(carName + " is not eligible for sale");
		}

		sc.close();
	}
}
