package in.array;

import java.util.Scanner;

public class DeleteArrayElement {

	public static void main(String[] args) {
		
		int a[]= {1,6,2,3,4,5};
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nEnter the element you want to delete");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==n) {
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}
				count++;
				break;
			}
		}
		
		if (count>0) 
		{
			System.out.println("Element delete successfully");
			for (int i = 0; i < a.length-1; i++) {
				System.out.println(a[i]);
			}
		}
		else 
		{
			System.out.println("Element is not found");
		}
		
		scanner.close();
	}
}
