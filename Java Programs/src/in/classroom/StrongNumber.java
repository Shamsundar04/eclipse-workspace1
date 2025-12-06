package in.classroom;

public class StrongNumber {

	public static void main(String[] args) {
		
//		1!+4!+5!=1+(4×3×2×1)+(5×4×3×2×1)=1+24+120=145
//		A strong number is a number whose sum of the factorials of its individual digits
//		is equal to the original number.
		
		
		int n=145;
		int sum=0;
		int original=n;
		for(;n!=0;n=n/10) {
			
			int remainder=n%10;
			int fact=1;
			for(int i=1;i<=remainder;i++) {
				fact=fact*i;
			}
			sum+=fact;
		}
		
		System.out.println(sum==original);
		
	}
}
