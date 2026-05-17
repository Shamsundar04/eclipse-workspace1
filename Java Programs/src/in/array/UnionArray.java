package in.array;

import java.util.Arrays;

public class UnionArray {
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        
        String str = "Java";
        String rev = "";

        for(int i=str.length();i>=0;i--) {
        	rev=rev+str.substring(i-1, i);
        }
        

        System.out.println("Reversed String: " + rev);
        
//        int union[]=new int[arr1.length+arr2.length];
//        int index=0;
//        
//        for(int i=0;i<arr1.length;i++) {
//        	union[index++]=arr1[i];
//        }	
//        
//        
//        for(int i=0;i<arr2.length;i++) {
//        	boolean isPresent=false;
//        	for(int j=0;j<arr2.length;j++) {
//        		if (arr2[i]==arr1[j]) {
//					isPresent=true;
//					break;
//				}
//        	}
//        	
//        	if (!isPresent) {
//				union[index++]=arr2[i];
//				break;
//			}
//        }
//        Arrays.sort(union);
//        for (int i : union) {
//        	if (i!=0) {
//        		System.out.print(i+" ");
//			}
//		}
	}
}