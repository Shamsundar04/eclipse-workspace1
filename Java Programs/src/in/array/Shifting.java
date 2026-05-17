package in.array;

public class Shifting {

	public static void main(String[] args) {
		
//		int a[]= {1,2,3,4,5};
////		3,4,5,1,2
//		int shift=2;
//		
//		int b[]=new int[a.length];
//		
//		for (int i = 0; i < a.length; i++) {
//			
////			b[(i+shift)%a.length]=a[i];
//			
////				0	2     +     5    %    5
////			3,4,5,1,2
//			
//			b[(i-shift+a.length)%a.length]=a[i];
//			
//		}
//		
//		for (int i : b) {
//			System.out.print(i+", ");
//		}
		
		
		
	
		
		
		int b[]=new int[a.length];
		int k=2;
		
		for(int i=0;i<a.length;i++) {
//			b[i]=a[(k+i)%a.length];
			b[(k+i)%a.length]=a[i];
		}
		
		for (int i : b) {
			System.out.print(i+" ");
		}
	}
}
