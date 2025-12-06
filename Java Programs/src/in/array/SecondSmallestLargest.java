package in.array;

import java.util.Arrays;

public class SecondSmallestLargest {

	public static void main(String[] args) {
		
		int a[] = { 6, 3, 2, 1, 5, 5, 4, 1, 1, 1, 6 };
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

//		int[] a = { 12, 35, 1, 10, 34, 1 };
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
		
		System.out.println(Arrays.toString(a));
//		
//		int secondLargest=a[a.length-2];
//		System.out.println(secondLargest);
		
		
		for(int i=0;i<a.length-1;i++) {
			if (a[i]!=a[i+1]) {
				System.out.println(a[i+1]);
				System.out.println(a[a.length-2]);
				break;
			}
		}
		
//		for(int i=0;i)
		
	}
}







//public class SecondSmallestLargest {
//    public static void main(String[] args) {
//        int a[] = {6, 3, 2, 1, 5, 5, 4, 1, 1, 1, 6};
//
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int num : a) {
//            // For smallest and second smallest
//            if (num < smallest) {
//                secondSmallest = smallest;
//                smallest = num;
//            } else if (num < secondSmallest && num != smallest) {
//                secondSmallest = num;
//            }
//
//            // For largest and second largest
//            if (num > largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest && num != largest) {
//                secondLargest = num;
//            }
//        }
//
//        System.out.println("Second Smallest: " + secondSmallest);
//        System.out.println("Second Largest: " + secondLargest);
//    }
//}

