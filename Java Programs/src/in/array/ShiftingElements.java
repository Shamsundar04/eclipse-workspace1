package in.array;

public class ShiftingElements {

	public static void main(String[] args) {
		
//		Input:  [0, 1, 0, 3, 12]
//		Output: [1, 3, 12, 0, 0]
		
//		int a[]= {0,1,0,3,12};
//		int index=0;
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if (0!=a[i]) {
//				a[index]=a[i];
//				index++;
//			}
//		}
//		
//		for(int i=index;i<a.length;i++) {
//			a[i]=0;
//		}
//		
//		for (int i : a) {
//			System.out.print(i+" ");
//			
//		}
		
		
		int a[]= {0,1,0,3,12};
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			
			if (a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		
		for(int i=index;i<a.length;i++) {
			a[i]=0;
		}
		
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
