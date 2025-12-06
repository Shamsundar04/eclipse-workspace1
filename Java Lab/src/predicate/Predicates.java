package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicates {

	public static boolean testPredicate(int n, Predicate<Integer> predicate) {
		return predicate.test(n);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Predicate<Integer> even = no -> no % 2 == 0;
		Predicate<Integer> greter = no -> no > 10;
		Predicate<Integer> prime = no -> {
			int count = 0;
			for (int i = 1; i <= no; i++) {
				if (no % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				return true;
			}
			return false;
		};

		System.out.println(testPredicate(n, prime));
		System.out.println(testPredicate(n, even));
		System.out.println(testPredicate(n, greter));

		sc.close();
	}
}
