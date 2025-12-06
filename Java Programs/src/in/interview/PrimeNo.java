package in.interview;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		boolean status = true;
		scanner.close();
		if (no < 2) {
			status = false;
		} else {

			for (int i = 2; i <= Math.sqrt(no); i++) {
				if (no % i == 0) {
					status = false;
					break;
				}
			}
		}
		if (status) {
			System.out.println(no + " is a prime number");
		} else {
			System.out.println(no + " is not a prime number");
		}		
	}
}
