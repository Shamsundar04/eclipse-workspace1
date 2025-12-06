package in.array;

public class AllUnique {
	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,4,6,2,5,4};
		int c=0;
//		3 5 6
		
		for(int i=0;i<arr.length;i++) {
			c=0;
			for(int j=0;j<arr.length;j++) {
//				 		1              
				if (arr[i]==arr[j]) {
					c++;
				}
			}
			
			if (c==1) {
				System.out.println(arr[i]);
			}
		}
	}
}