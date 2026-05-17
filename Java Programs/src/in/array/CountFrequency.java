package in.array;

public class CountFrequency {

	public static void main(String[] args) {
		
		int []a= {3,9,3,2,9};
		
		boolean freq[]=new boolean[a.length];
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			
			if (freq[i]==true) {
				continue;
			}
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					count++;
					freq[j]=true;
				}
			}
			
			System.out.println(a[i]+" -> "+count);
		}
	}
}