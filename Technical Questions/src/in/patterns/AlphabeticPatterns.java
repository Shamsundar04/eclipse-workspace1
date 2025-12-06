package in.patterns;

public class AlphabeticPatterns {

	public static void main(String[] args) {
		
		
//		A  
//		A B  
//		A B C  
//		A B C D  
			
//		int i;
//		for(i=1;i<=4;i++){
//			
//			for(char ch='A';ch<'A'+i;ch++) {
//				
//				System.out.print(ch+" ");
//			}
//			System.out.println();
//		}
		
		
		
//			  A  
//		    A B  
//		  A B C  
//		A B C D 
		
//		int i,s,n=4;
//		for(i=1;i<=n;i++) {
//			for(s=n-i;s>0;s--) {
//				System.out.print("  "); //- 
//			}
//			for(char ch='A';ch<'A'+i;ch++) {
//				System.out.print(ch+" ");
//			}		
//			System.out.println();
//		}
		
		
//		    A  
//		   ABA  
//		  ABCBA  
//		 ABCDCBA  

		
		int i,s,n=4;
		
		for(i=0;i<=n;i++) {
			
			for(s=n-i;s>0;s--) {
				System.out.print("  ");
			}
			
			for(char ch='A';ch<'A'+i;ch++) {
				System.out.print(ch+" ");
			}
			
			for(char ch=(char)('A'+i);ch>='A';ch--) {
				System.out.print(ch+" ");
			}
			System.out.println();
			
		}
		
		
	}
}
