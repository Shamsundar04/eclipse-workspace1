package in.string;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String name="programrming";
		
		boolean[]visited=new boolean[name.length()];
		
				
		int duplicateCharCount=1;
		
		char[] charArray = name.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			duplicateCharCount=1;
			
			if (visited[i]==true) continue;
			
			for(int j=i+1;j<charArray.length;j++) {
				
				if (charArray[i]==charArray[j]) {
					duplicateCharCount++;
					visited[j]=true;
				}
			}
			
			if(duplicateCharCount>1) {
				System.out.println(charArray[i]+" "+duplicateCharCount);
			}
		}
	}
}
