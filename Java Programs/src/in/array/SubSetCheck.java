package in.array;

public class SubSetCheck {
	

    public static boolean isSubset(int a[], int b[]) {
    	
//    	11, 3, 7, 1, 7
    	for(int i=0;i<b.length;i++) {
    		boolean found=false;
    		
//    		11, 7, 1, 13, 21, 3, 7, 3
    		for(int j=0;j<a.length;j++) {
//    				  9     3
    			if (b[i]==a[j]) {
					found=true;
				}
    		} 
    		
    		if (!found) {
				return false;
			}
    	}
    	
    	return true;
        
    }
	
	public static void main(String[] args) {
		 int arr[]={1, 2, 2};
		 int sub[] = {1,1};
		 boolean subset = SubSetCheck.isSubset(arr, sub);
		 System.out.println(subset);
	}
}
