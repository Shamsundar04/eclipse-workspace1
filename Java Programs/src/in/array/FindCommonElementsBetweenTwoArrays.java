package in.array;

public class FindCommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		
//		Array 1: {1, 2, 3, 4, 5}
//		Array 2: {3, 4, 5, 6, 7}
//		Output: 3 4 5
		
		int a[]={1, 2, 3, 4, 5};
		int b[]={3, 4, 5, 6, 7};

		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if (a[i]==b[j]) {
					System.out.println(a[i]);
					break;	
				}
			}
		}
		

	}

}
