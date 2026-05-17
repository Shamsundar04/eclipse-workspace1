package in.string;

import java.util.HashSet;

public class SubStringCheck {

	public static void main(String[] args) {

//      String str = "HelloWorld";
//      String sub = "World";
		
//      System.out.println(str.contains(sub));		
		
		
		
//		String str = "banana";
//		String sub = "ana";
//		int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i + 1; j <= str.length(); j++) {
//				String substr = str.substring(i, j);
//				if (substr.equals(sub)) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
		
		
		 String str = "abcabcbb";
		 int maxLength=0;
		 String result="";
		 

			HashSet<Character> set=new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) { 
			
			for (int j = i ; j < str.length(); j++) {
			 
				if (set.contains(str.charAt(j))) {
					break;
				}
				
				set.add(str.charAt(j));
				
				if (set.size()>maxLength) {
					maxLength=set.size();
					result=str.substring(i, j+1);
				}
			}
		}
		
		System.out.println(maxLength+" "+result);
	}
//	
//	public static boolean isUnique(String s) {
//		HashSet<Character> set=new HashSet<>();
//		
//		for(char c : s.toCharArray()) {
//			
//			if (set.add(c)) {
//				return false;
//			}
//		}
//		
//		return true;
//	}
}