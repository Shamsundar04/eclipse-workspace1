package in.array;

public class Smalles_Largest {

	public static void main(String[] args) {

		int a[] = { 4, 5, 3, 2, 1 };
		int firstLarge = 0;
		int secondLarge = 0;
		
		int firstSmall=9;
		int secondSmall=0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = a[i];
			} else if (a[i] > secondLarge && a[i] != firstLarge) {
				secondLarge = a[i];
			}
			
			if (a[i]<firstSmall) {
				secondSmall=firstSmall;
				firstSmall=a[i];
			}else if (a[i]<secondSmall&&a[i]!=firstSmall) {
				secondSmall=a[i];
			}
		}
		System.out.println(secondLarge);
		System.out.println(secondSmall);
	}

}
