package in.patterns_numbers;

public class ZeroOnePyramid {

	public static void main(String[] args) {

		int i, j, k = 1;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k);

				if (k == 1)
					k--;
				else
					k++;
			}
			System.out.println();
		}
	}
}