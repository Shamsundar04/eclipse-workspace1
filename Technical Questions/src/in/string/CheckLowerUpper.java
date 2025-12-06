package in.string;

import java.util.Scanner;

public class CheckLowerUpper {

	public static void main(String[] args) {
		
		System.out.println("Enter the character");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		String result = ch >= 'a' && ch <= 'z' ? "lower" : "upper";
		System.out.println(result);
		scanner.close();

	}

}
