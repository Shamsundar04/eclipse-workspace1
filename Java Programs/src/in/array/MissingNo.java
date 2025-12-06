package in.array;

import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {
		
		int arr[]={3,0,1,2,5};
		Arrays.sort(arr);
		int cnt=0;
		for (int i : arr) {
			if(i!=cnt)
				System.out.println(cnt);
			cnt++;
		}
	}
}
