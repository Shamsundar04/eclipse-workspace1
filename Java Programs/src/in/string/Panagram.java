package in.string;

public class Panagram {

	public static void main(String[] args) {
//		means it should contains all the a to z characters
		
		String str = "Java@123!";
        int alphabets = 0, digits = 0, special = 0;
        
        for(int i=0;i<str.length();i++) {
        	
        	char c = str.charAt(i);
        	
        	if (c>48 && c<57) {
				digits++;
			}else if (c>'a'&&c<'z' || c>'A'&&c<'z') {
				alphabets++;
			}else {
				special++;
			}
    
        }
		System.out.println(digits+" "+alphabets+" "+special);
        
//        System.out.println((char)57);

//        String str = "The quick brown fox jumps over the lazy dog";
//        str = str.toLowerCase();
//
//		boolean present[]=new boolean[26];
//
//		for(int i=0;i<str.length();i++) {
//
//			char c = str.charAt(i);
//
//			if (c>='a' && c<='z') {
//				present[c - 'a']=true;
//			}
//		}
//
//		boolean isPanagram=true;
//
//		for (boolean b : present) {
//
//			if (!b) {
//				isPanagram=false;
//				break;
//			}
//		}
//		System.out.println(isPanagram?"panagram":"not panagram");
	}
}
