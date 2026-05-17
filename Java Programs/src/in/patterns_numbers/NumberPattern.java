package in.patterns_numbers;

public class NumberPattern {
	
	public static void main(String[] args) {
//		int counter=1;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(counter+" ");
//				counter++;
//			}
//			System.out.println();
//		}
		
//        1
//      1   1
//    1   2   1
//  1   3   3   1
//1   4   6   4   1
		
		int row=5;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++) {
				
				if (i==3&&j==2) {
					System.out.print("2 ");
				}
				else if (i==4 && j==2) {
					System.out.print("3 ");
				} 
				else {
					System.out.print("1 ");
				}
			}
			
			System.out.println();
		}
		  
		
		
		

		
	}

}
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
