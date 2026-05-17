package in.array;

public class TransformRowToColumn {

	public static void main(String[] args) {
		
		int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
		
		
		for(int i=0;i<a.length;i++) {			
			for(int j=i;j<a.length;j++) {				
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		int n=a.length;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length/2;j++) {
				
				int temp=a[i][j];
				a[i][j]=a[i][n-1-j];
				a[i][n-1-j]=temp;
				
			}
		}
		
		for(int[] row : a) {
			for(int c : row) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
