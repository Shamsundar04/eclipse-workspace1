package in.array;

import java.util.Scanner;

public class TwoDimensionArrayFindLocation {
	public static void main(String[] args) {
		int arr[][] = { 
				{5, 4, 1},
	            {2, 3, 1},
	            {9, 2, 6}};
		
		Scanner snc=new Scanner(System.in);
		System.out.print("Enter the no you want to find location : ");
		int no=snc.nextInt();
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {			
			for(int j=0;j<arr[i].length;j++) {
				if (arr[i][j]==no) {
					System.out.println(i+" "+j);
					flag=true;
					break;
				}
			}
			if (flag==true) {
				break;
			}
		}
		
		if (flag==false) {
			System.out.println(no+" not found");
		}
		
		snc.close();
	}
}
