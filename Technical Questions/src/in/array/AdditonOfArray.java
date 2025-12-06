package in.array;

public class AdditonOfArray {
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		int a3[]=new int[a1.length];
		
		for (int i = 0; i < a1.length; i++) {
					
					a3[i]=a1[i]+a2[i];
		}

		for(int no:a3) {
			System.out.println(no);
		}
	}
}