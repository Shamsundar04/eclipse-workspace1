package in.recursion;

public class SumOfDigits {

	static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 10) + sum(n / 10);
	}

	public static void main(String[] args) {

		System.out.println(sum(121));

//		int n=121;
//		int sum=0;
//		
//		while (n!=0) {
//			
//			int rem=0;
//			
//			rem=n%10;
//			sum+=rem;
//			n=n/10;
//			
//		}
//		
//		System.out.println(sum);
	}
}
