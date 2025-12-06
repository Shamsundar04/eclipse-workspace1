package in.array;

import java.util.Set;
import java.util.TreeSet;

public class Duplicate_Values {

	public static void main(String[] args) {
		
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
		
		int []n= {9,2,1,3,3,5,4,6,8,7};
		
		Set<Integer> hashSet=new TreeSet<Integer>();
		for (int i = 0; i < n.length; i++) {
			
			hashSet.add(n[i]);
		}
		
		for(int no:hashSet) {
			System.out.println(no);
		}
	}
}
