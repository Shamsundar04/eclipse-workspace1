package in.array;

import java.util.Scanner;

public class TwoDimensionArray {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int arr[][] = { 
				{5, 4, 1},
	            {2, 3, 1},
	            {9, 2, 6}};
		
		for(int i=0;i<arr.length;i++) {
			
			int a[]=arr[i];
			
			
			for(int j=0;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) { 
					
					if (a[j]>a[k]) {
						int t=a[j];
						a[j]=a[k];
						a[k]=t;					
					}
				}
			}
		
			
			arr[i]=a;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=scn.nextInt();
//			}
//		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
//		for(int a[]:arr) {
//			for(int b:a) {
//				System.out.print(b+" ");
//			}
//			System.out.println();
//		}
		
		scn.close();
	}
}
