package in.string;

public class ConsecutiveString {

	public static void main(String[] args) {

	    String str = "aaabbccddd";
	    
	    
	    
	    boolean []visited=new boolean[str.length()];
	    
	    for(int i=0;i<str.length();i++) {
	    	
	    	if (visited[i]==true) continue;
	    	
	    	int count=1;
	    	for(int j=i+1;j<str.length();j++) {
	    		if(str.charAt(i)==str.charAt(j)) {
	    			count++;
	    			visited[j]=true;
	    		}
	    	}
	    	
	    	System.out.print(str.charAt(i)+""+count);
	    }
	    
	    
	    
	    
//	    boolean[] visited=new boolean[str.length()];
//	    
//	    for(int i=0;i<str.length();i++) {
//	    	
//	    	if (visited[i]) continue;
//
//	    	int count=1;
//	    	
//	    	for(int j=i+1;j<str.length();j++) {
//	    		
//	    		if (str.charAt(i)==str.charAt(j)) {
//					count++;
//					visited[j]=true;
//				}
//	    	}
//	    	
//	    	System.out.print(str.charAt(i)+""+count);
//	    }
	    
	    
	    
	    
//        boolean[] visited = new boolean[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (visited[i]) continue;
//
//            int count = 1;
//
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                    visited[j] = true;
//                }
//            }
//
//            System.out.print(str.charAt(i) + "" + count);
//        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		StringBuilder result = new StringBuilder();
//
//		int count = 1;
//
//		for (int i = 1; i <= str.length(); i++) {
//
//			if (i < str.length() && (str.charAt(i) == (str.charAt(i - 1)))) {
//				count++;
//			} else {
//				result.append(str.charAt(i-1)).append(count);
//				count=1;
//			}
//		}
//		System.out.println(result.toString());
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
