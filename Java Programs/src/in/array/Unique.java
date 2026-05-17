package in.array;

public class Unique {

	public static void main(String[] args) {
		
//		int a[]= {1,2,1,3,4,6,2,5,4};
//		int counter=0;
//		
//		for(int i=0;i<a.length;i++) {
//			
//			
//			for(int j=0;j<a.length;j++) {
//				
//				if (a[i]==a[j]) {
//					counter++;
//				}
//			}
//			
//			if (counter==1) {
//				System.out.println(a[i]);
//			}
//			
//			counter=0;
//		}
		
		
		int a[] = {4,3,2,1};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        System.out.println(Integer.MAX_VALUE);

        for (int num : a) {
            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println(secondSmallest);
	}
}
