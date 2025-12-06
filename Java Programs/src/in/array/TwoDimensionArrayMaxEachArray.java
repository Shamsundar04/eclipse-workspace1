package in.array;

public class TwoDimensionArrayMaxEachArray {
	public static void main(String[] args) {
		
		int arr[][] = { 
				{5, 4, 1},
	            {2, 3, 1},
	            {9, 2, 6}};
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			int a[]=arr[i];
		
			int max=a[0];
			for(int j=0;j<a.length;j++) {
				
				if (a[j]>max) {
					max=a[j];
				}
			}
			System.out.println(" max number of "+(i+1)+" row : "+max);
		}
		
//		int a[]={5, 4, 1};
//		
//		int max=a[0];
//		
//		for(int j=0;j<a.length;j++) {
//			if (a[j]>max) {
//				max=a[j];
//			}
//		}
//		
//		System.out.println(max);
		
	}
}
