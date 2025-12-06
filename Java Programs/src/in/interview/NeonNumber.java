package in.interview;

public class NeonNumber {
	
	public static void main(String[] args) {
		int n=9,square,sum = 0;
		
		square=n*n;
		while(square>0) {
			sum+=square%10;
			square=square/10;
		}	
		if (sum==n) {
			System.out.println("neon");
		}
	}
}
