package in.classroom;

public class PerfectNumber {
	public static void main(String[] args) {
		
//		A perfect number is a positive integer that is equal to the sum of its proper positive divisors
//		(i.e., its positive divisors excluding the number itself).
		
		int n=6,sum=0;
		
//		int no=1234;
//		int len = String.valueOf(no).length();
//		System.out.println(len);
		
		for(int i=1;i<n;i++) {
			
			if (n%i==0) {
				sum+=i;
			}
		}
		System.out.println((sum));
	}
}
