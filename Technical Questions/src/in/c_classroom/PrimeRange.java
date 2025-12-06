package in.c_classroom;

public class PrimeRange {

	public static void main(String[] args) {
		
		int n=100,i,j,k=0;
		
		for(i=2;i<=n;i++) {
			for(k=0,j=1;j<=i;j++) {
				
				if(i%j==0) {
					k++;
				}
			}
			
			if (k==2) {
				System.out.println(i);
			}
		}
	}
}

