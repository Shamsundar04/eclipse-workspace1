package in.recursion;

public class FactorialRecursion {
	
	public static int sumDigits(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return (n % 10) + sumDigits(n / 10); // recursive case
//        		 3		+      12
//               2      +      1
//               1      +      0
    }
	
	public static void main(String[] args) {
		int num=123;
		
		System.out.println(sumDigits(num));
		
	}
}
