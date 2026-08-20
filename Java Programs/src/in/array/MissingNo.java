package in.array;

import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {
		
//		int arr[]={3,0,1,2,5};
//		Arrays.sort(arr);
//		int cnt=0;
//		for (int i : arr) {
//			if(i!=cnt)
//				System.out.println(cnt);
//			cnt++;
//		}
		
		
		
		
		
		int[] arr = {3, 1, 3, 4, 5};

		int n = 5;

		for (int i = 1; i <= n; i++) {
		    boolean found = false;

		    for (int j = 0; j < arr.length; j++) {
		        if (arr[j] == i) {
		            found = true;
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("Missing number: " + i);
		    }
		}
	}
}
