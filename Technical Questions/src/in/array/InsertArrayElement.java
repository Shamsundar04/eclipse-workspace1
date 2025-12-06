package in.array;

import java.util.Scanner;

public class InsertArrayElement {
	public static void main(String[] args) {

		System.out.println("Enter the character");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		String result = ch >= 'a' && ch <= 'z' ? "lower" : "upper";
		System.out.println(result);
		scanner.close();
	}
}
