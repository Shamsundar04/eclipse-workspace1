package in.patterns_numbers;

public class Reverse_Pyramid {

	public static void main(String[] args) {
		
		int i,j;
		
		for(i=0;i<=4;i++) {
			
			for(j=1;j<=4-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}