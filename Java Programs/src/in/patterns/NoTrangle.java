package in.patterns;

public class NoTrangle {

	public static void main(String[] args) {

//		for(int i=1;i<=5;i++) {
//			
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1;j<=(i*2)-1;j++) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}

//		 1
//	    123
//	   12345
//	  1234567
//	 123456789

//		int n=5,i,j,k;
//		int l;
//		for(i=1;i<=n;i++) {
//
//			for(j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			
//			for(k=1;k<=i;k++) {
//				System.out.print(k);
//			}
//			
//			for(l=i-1;l>=1;l--) {
//				System.out.print(l);
//			}
//			
//			System.out.println();
//		}

//		 1
//	    121
//	   12321
//	  1234321
//	 123454321

//		int n = 5, i, j;
//		for (i = 1; i <= n; i++) {
//			for (j = 1; j <= i; j++) {
//				if (j % 2 == 0) {
//					System.out.print("0");
//				} else {
//					System.out.print("1");
//				}
//			}
//			System.out.println();
//		}
		
		
		int n=54321;
		
		System.out.println(
				n%10+""+(n/10)%10+""+(n/100)%10+""+(n/1000)%10+""+(n/10000)%10
				);
				
	}
}
