package in.patterns;

public class SnakePattern {

	public static void main(String[] args) {
		
		int rows=5,cols=4;
		int num;
		
		for(int row=1;row<=rows;row++) {
			
			num=row;
			
			for(int col=1;col<=cols;col++) {	
				System.out.print(num+" ");
				num+=rows;
			}

			System.out.println();
		}

	}

}
