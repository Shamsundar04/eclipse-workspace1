package in.elc;

import java.util.Scanner;

import in.blc.CarBlc;

public class CarElc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Car Model :");
		String carModel = scanner.nextLine();

		System.out.print("Enter Car Manufacturing year :");
		int carManufacturingYear = scanner.nextInt();

		System.out.print("Enter Car Price :");
		double carPrice = scanner.nextDouble();

		CarBlc carBlc = new CarBlc(carModel, carManufacturingYear, carPrice);
		System.out.println(carBlc);

		scanner.close();
	}
}
