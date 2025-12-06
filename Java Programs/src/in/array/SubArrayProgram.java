package in.array;

import java.util.HashSet;

public class SubArrayProgram {
	
    int[] A = {1, 2, 3, 4, 5};
    int[] B = {2, 4, 5};
    
    
    public boolean subArray() {
    	HashSet<Integer> set=new HashSet<>();
        
        for(Integer n:A) {
        	set.add(n);
        }
        
        for (Integer integer : B) {
			
        	if (!set.contains(integer)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		SubArrayProgram subArrayProgram=new SubArrayProgram();
		boolean subArray = subArrayProgram.subArray();
		
		if (subArray) {
			System.out.println("b is sub array");
		}
	}
}
