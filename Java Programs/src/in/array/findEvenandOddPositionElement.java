package in.array;

public class findEvenandOddPositionElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 4, 6, 2, 5, 4 };

		System.out.print("Even Positions ");
		for (int i = 0; i < arr.length; i++) {
//					%2==0
			if (arr[i] % 2 == 0) {
				System.out.print(i + 1 + " ");
			}
		}

		System.out.print("\nOdd Positions ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print((i + 1) + " ");
			}
		}

	}
}
