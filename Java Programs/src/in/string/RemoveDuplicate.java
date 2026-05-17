package in.string;

import java.util.HashSet;

public class RemoveDuplicate {
	
	HashSet<Character> set=new HashSet<>();
	
	public String removeDulplicate(String name) {

		for (char ch : name.toCharArray()) {
			if (set.contains(ch)) {
				set.remove(ch);
			}

			set.add(ch);
		}
		System.out.println(set);
		return null;
	}
	
	
	public static void main(String[] args) {
//		RemoveDuplicate obj=new RemoveDuplicate();
//		String result = obj.removeDulplicate("rraamm");
//		System.out.println(result);
		
		
//		String str="programming";    // progamin
//		int counter=0;
//		String str2="";
//		for(int i=0;i<str.length();i++) {
//			
//			for(int j=0;j<str.length();j++) {
//				
//				if (str.charAt(i)==str.charAt(j)) {
//					counter++;
//				}
//			}
//			
//			if (counter==1) {
//				str2+=str.charAt(i);
//			}
//			
//			counter=0;
//		}
//		
//		
//		System.out.println(str2);
		
		
//		String str="programming";
//        boolean isDuplicate=false;
//
//        for(int i=0;i<str.length();i++){
//            isDuplicate=false;
//
//            for(int j=0;j<i;j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    isDuplicate=true;
//                    break;
//                }
//         }
//
//            if(!isDuplicate){
//                System.out.print(str.charAt(i));
//            }
//        }
		
		
		
		
//		String str="programming";    // progamin
//		String result="";
//		
//		for(int i=0;i<str.length();i++) {
//			
//			if (result.indexOf(str.charAt(i)) == -1) {
//				result=result+str.charAt(i);
//			}
//		}
//
//		System.out.println(result);
//		
//		String string="A man a plan a canal Panama";
//		String trim = string.trim();
//		System.out.println(trim);
		
		
	}
}