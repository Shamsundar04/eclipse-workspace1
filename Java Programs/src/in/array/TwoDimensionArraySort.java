package in.array;

import java.util.Arrays;

public class TwoDimensionArraySort {
	public static void main(String[] args) {
		
		int mat[][] = { 
				{5, 4, 7},
                {1, 3, 8},
                {2, 9, 6} };
		int len=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				len+=1;
			}
		}
		
		int a[]=new int[len];
		int c=0;
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				a[c++]=mat[i][j];
			}
		}
		
		Arrays.sort(a);
		for(int a2:a) {
			System.out.println(a2);
		}
		
		c=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=a[c++];
			}
		}
		
		for(int a3[]:mat) {
			for(int n:a3) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(mat));
	}
}
