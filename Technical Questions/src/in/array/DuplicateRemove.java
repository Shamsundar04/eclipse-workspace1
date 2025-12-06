package in.array;

public class DuplicateRemove {

	public static void main(String[] args) {

		int a[] = { 5, 4, 6, 3, 7, 2, 8, 1, 9, 5, 4, 6, 3, 7, 2, 8, 1, 9 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		for (int i : a) {
			System.out.print(i + " ");
		}

		int temp1[] = new int[a.length - 9];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			// Comparison
			if (a[i] != a[i + 1]) {
				temp1[j] = a[i];
				j++;
			}
		}
		
		temp1[j]=a[a.length-1];
		
		System.out.println("\nRemoving duplicate array");
		for (int i : temp1) {
			System.out.print(i + " ");
		}
	}
}
