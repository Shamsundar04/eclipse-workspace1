package in.numeric_questions;

public class PalindromeNumber {
	

	public static void main(String[] args) 
	{
		
		long n=1111101101111L;
		int count=0;
		int onecout=0;
		
		while(n!=0) {
			
			long lastDigit=n%10;
			
			if (lastDigit==1) {
				count++;
			}
			else {
				
				if (count>=onecout) {
					onecout=count;
				}
				count=0;
			}
			n=n/10;
		}

		if (count>onecout) {
			onecout=count;
		}
				
		System.out.println(onecout);
	}
}

//11011101111
