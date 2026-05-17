package in.numeric;

public class SmallestLargest {
	public static void main(String[] args) {
		int num=1234;
		int small=9;
		int large=0;
		while (num!=0) {
			
			int digit=num%10;
			
			if (digit<small) {
				small=digit;
			}
			
			if (digit>large) {
				large=digit;
			}
			
			num=num/10;
		}
		
		System.out.println(small+" "+large);
	}
}