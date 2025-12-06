package in.string;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String name="programming";
		int duplicateCharCount=1;
		
		char[] charArray = name.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			
			duplicateCharCount=1;
			for(int j=i+1;j<charArray.length;j++) {
				
				if (charArray[i]==charArray[j]) {
					duplicateCharCount++;
					System.out.println(charArray[j]+" "+duplicateCharCount);
				}
			}
		}
	}
}
