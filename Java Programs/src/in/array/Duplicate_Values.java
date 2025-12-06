package in.array;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;

public class Duplicate_Values {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 1, 2, 3};
		HashSet<Integer> seen=new HashSet<>();
//		HashSet<Integer> duplicate=new HashSet<>();
		
		for (int n : arr) {
			seen.add(n);
		}
		
//		System.out.print(seen);
		
		seen.forEach((n)->System.out.println(n));
		
		
//		for (int n : arr) {
//			if (!seen.add(n)) {
//				duplicate.add(n);
//			}
//		}
//		
//		System.out.println(duplicate);

		
		
//		int arr[] = {2, 3, 1, 2, 3};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
////						2		3			2 3					
//				if (arr[i]==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
		
//		int []a= {1,1,2,2,3,3,4,4,5,5};
////		int []temp=new int[a.length];
//		int j=0;
//		
//		for (int i = 0; i < a.length-1; i++) {
//			
//			if (a[i]!=a[i+1]) {
//				
////				temp[j]=a[i];
//				a[j]=a[i];
//				j++;
//			}
//			
//		}
//		
//		a[j]=a[a.length-1];
//		
//		for(int n:a) {
//			System.out.println(n);
//		}
		
//		temp[j]=a[a.length-1];
//		for(int no:temp) {
//			System.out.println(no);
//		}
		
//		int []n= {9,2,1,3,3,5,4,6,8,7};
//		
//		Set<Integer> hashSet=new TreeSet<Integer>();
//		for (int i = 0; i < n.length; i++) {
//			
//			hashSet.add(n[i]);
//		}
//		
//		for(int no:hashSet) {
//			System.out.println(no);
//		}
	}
}
