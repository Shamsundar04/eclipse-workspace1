package in.array;

public class TwoDimensionArrayCountSortedArrays {
	
	public boolean isAscending(int arr[]) {
//		1, 1, 1, 4, 5
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1]) {
				return false;
			}
		}
		
		return true;		
	}
	
	public boolean isDecending(int arr[]) {
//		5 4 3 2 1
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i]<arr[i+1]) {
				return false;
			}
		}
		
		return true;		
	}
	
	
	public static void main(String[] args) {
		TwoDimensionArrayCountSortedArrays t=new TwoDimensionArrayCountSortedArrays();
		
		int arr[][] = {
				{ 1, 1, 1, 4, 5 },
				{ 9, 8, 5, 4, 3 },
				{ 2, 3, 4, 0, 1 },
				{ 2, 4, 5, 6, 8 }};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if (t.isAscending(arr[i])||t.isDecending(arr[i])) {
				c++;
			}
		}
		System.out.println(c);
	}
}
