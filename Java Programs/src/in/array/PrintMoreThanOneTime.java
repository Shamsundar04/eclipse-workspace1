package in.array;

public class PrintMoreThanOneTime {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 3, 4, 6, 2, 5, 4 };
		int counter = 0, inc = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					counter++;
				}
			}

			if (counter >= 2) {
				inc++;
			}

			counter = 0;
		}

		System.out.println(inc);

	}

}
