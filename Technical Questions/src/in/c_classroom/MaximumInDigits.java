package in.c_classroom;

public class MaximumInDigits {

	public static void main(String[] args) {
		
		int n=8234569,r,max=0;
		
		for(;n!=0;n=n/10) {
			r=n%10;
			
			if(r>max)max=r;
		}
		System.out.println(max);
	}
}
