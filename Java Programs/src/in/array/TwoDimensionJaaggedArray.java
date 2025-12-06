package in.array;

import java.util.Scanner;

public class TwoDimensionJaaggedArray {
	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the array length : ");
		int size=scn.nextInt();
		
		int arr[][]=new int [size][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+(i+1)+"st array length : ");
			int s=scn.nextInt();			
			arr[i]=new int[s];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		
		for(int a[]:arr) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
//		int arr[][] = { 
//				{5, 4, 7, 8},
//	            {1, 3, 8, 9, 100},
//	            {9, 2} };
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			int a[]=arr[i];
//			
//			for(int j=0;j<a.length;j++) {
//				for(int k=j+1;k<a.length;k++) {
//					if (a[j]>a[k]) {
//						int t=a[j];
//						a[j]=a[k];
//						a[k]=t;
//					}
//				}
//			}
//			
//			arr[i]=a;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		

//		int c=1;
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=i;j++) {				
//					System.out.print((c++)+" ");
//			}
//			System.out.println();
//		}
		
//		1
//		2 3
//		4 5 6
		
		scn.close();
	}
}
