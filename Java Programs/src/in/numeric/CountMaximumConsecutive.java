package in.numeric;

public class CountMaximumConsecutive {

	public static void main(String[] args) {
		
//		long n=11011101111L;
//		int countNumber=0;
//		int maxCount=0;
//		int groupOfConsecutive=1;
//		while(n!=0) {
//
//			long digit=n%10;
//			
//			if (digit==1) {
//				countNumber++;
//				if (countNumber>maxCount) {
//					maxCount=countNumber;
//				}	
//			}
//			else {
//				countNumber=0;
//				groupOfConsecutive++;
//			}
//			n/=10;
//		}
//		
//		System.out.println(maxCount);
//		System.out.println("Group of consecutive "+groupOfConsecutive);
		
		
//		Count how many groups of consecutive 1s exist in number 1110101110111.
//		👉 Example: 111010 has 2 groups (111 and 1).
		
		long n=11011101111L;
		int countNumber=1;
	
		while(n!=0) {

			long digit=n%10;
			
			if (digit==0) {
				countNumber++;
			}
			
			n/=10;
		}
		
		System.out.println(countNumber);
	}
}
