package in.array;

public class AllUnique {
	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,4,6,2,5,4};
		
		boolean visited[]=new boolean[arr.length];

		for(int i=0;i<arr.length;i++) {
		
			if (visited[i]) {
				continue;
			}
			
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					visited[j]=true;
				}
			}

			System.out.println(arr[i]);
		}

//		int c=0;
////		3 5 6
//		
//		for(int i=0;i<arr.length;i++) {
//			c=0;
//			for(int j=0;j<arr.length;j++) {
////				 		1              
//				if (arr[i]==arr[j]) {
//					c++;
//				}
//			}
//			
//			if (c==1) {
//				System.out.println(arr[i]);
//			}
//		}
	}
}