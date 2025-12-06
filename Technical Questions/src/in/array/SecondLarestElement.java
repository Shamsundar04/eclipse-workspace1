package in.array;

public class SecondLarestElement {

	public static void main(String[] args) {

		int[] a = { 3, 3, 2, 1, 4, 4, 5, 2 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		
		int secondLargest=a[a.length-2];
		System.out.println(secondLargest);
		
	}
}
