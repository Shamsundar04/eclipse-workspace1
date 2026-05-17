package in.array;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int start = 0;
		int end = a.length - 1;

		while (start < end) {

			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

			start++;
			end--;
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
		
//		int b[]=new int[a.length];
//		int index=0;
//		
//		for (int i = a.length-1; i>=0; i--) {
//			b[index]=a[i];
//			index++;
//		}
//		
//		for (int i : b) {
//			System.out.println(i);
//		}
	}
}
