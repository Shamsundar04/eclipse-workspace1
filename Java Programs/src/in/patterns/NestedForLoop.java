package in.patterns;


public class NestedForLoop {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++) {
//			
//			for (int j = 0; j < i; j++) {
//				
//				System.out.print(" *");
//			}
//			
//			System.out.println();
//			
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			
//			for (int j = 5; j > i ; j--) {
//				
//				System.out.print(" *");
//			}
//			
//			System.out.println();
			
//		}
		
//		Scanner scanner=new Scanner(System.in);
//		int row=scanner.nextInt();
		
//		for(int i = 1; i <= row; i++) {
//			
//			for(int j = 1; j <= row-i; j++) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int k = 1; k <= (2*i-1); k++) {
//				
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		for(int i = 1; i <= row; i++) {
//			
//			for(int j = 1; j <= row - i; j++) {
//				System.out.print(" ");
//			}
//
//			for(int k = 1; k <= (2*i-1); k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		for(int i=1; i <= 4; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 4; k >= i; k--) {
//				System.out.print("*");
//			}
//			
//			for(int l = 3; l >= i; l--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}	
//		scanner.close();
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			
//			for(int l=1; l<=i; l++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=1; k<=(2*i-1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=1; k<=(2*i-1); k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i=5; i>=1; i--) {
//			for(int j=5; j>=i; j--) {
//				System.out.print(" ");
//			}
//
//			for(int k=1; k<=(2*i-1); k++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if (i==1 || i==5 || j==1 || j==5)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
        
	    
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if (i==1 || i==5 || j==1 || j==5) {
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			
//			System.out.println();
//		}
		int n=5;
		for(int i=1;i<=n;i++) {
			
			// Left stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			// Spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			
			// Right stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}