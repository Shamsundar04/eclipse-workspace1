package in.array;

public class CountNoOccurence {
	public static void main(String[] args) {
		
		
		
		int n[]= {1,2,2,2,3,3,4,4},i,j,c;
		boolean visited[]=new boolean[n.length];
		
		for(i=0;i<n.length;i++) {
			
			c=0;
			
			if (visited[i]) {
				continue;
			}
			
			for(j=0;j<n.length;j++) {
				
				if (n[i]==n[j]) {
					c++;
					visited[j]=true;
				}
			}
			
			System.out.println(n[i]+" "+c);
		}	
	}
}
