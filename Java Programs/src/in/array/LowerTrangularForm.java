package in.array;

import java.util.Iterator;

public class LowerTrangularForm {

	public static void main(String[] args) {
		
		int arr[]= {1,0,2,9,3,0,4};
		
		int index=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		
		while (index<arr.length) {
			arr[index]=0;
			index++;
		}
			
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
//		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if (j>i) {
//					arr[i][j]=0;
//				}
//			}
//		}
//		
//		for (int[] row : arr) {
//			
//			for (int i : row) {
//				System.out.print(i+" ");
//			}
//			
//			System.out.println();
//		}
		
		

	}

}
