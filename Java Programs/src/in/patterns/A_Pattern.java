package in.patterns;


public class A_Pattern {
	
//	    *   
//	   * *  
//	  *   * 
//	 * *** * 
//	 *     *


	public static void main(String[] args) {
		
		int r=6;
		for(int i=r;i>=1;i--) {
			
			for(int j=1;j<=2*r;j++) {
				
				if (j==i||j==(2*r-i)) {
					
					System.out.print("*");
				}
				// Middle bar: only once at the center row
				else if (i == 3 && j > i && j < (2 * r - i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
