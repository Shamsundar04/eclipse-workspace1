package in.array;

public class TwoDimensionArrayDiagonal {
	public static void main(String[] args) {
		int arr[][] = { 
				{ 2, 7, 6 },
				{ 9, 5, 1 },
				{ 4, 3, 8 }};
		
		int pd=0;
		int hd=0;
		
		for(int i=0;i<arr.length;i++) {
			pd=pd+arr[i][i];
			hd=hd+arr[i][(arr[i].length-1)-i];
		}
		int rsum=0,csum=0;
		if (pd==hd) {
			for(int i=0;i<arr.length;i++) {
				 rsum=0;csum=0;
				
				for(int j=0;j<arr[i].length;j++) {
					rsum=rsum+arr[i][j];
					csum=csum+arr[j][i];
				}
				
				if (pd!=rsum || hd!=csum) {
					System.out.println("Not magic matrix");
					return;
				}
				
			}
			
			System.out.println("magic matrix");
		}
		else {
			System.out.println("Not magic matrix");
			return;
		}
	}
}
