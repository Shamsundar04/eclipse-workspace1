package in.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		
//		i.like.this.program.very.much
//		much.very.program.this.like.

		String words="i.like.this.program.very.much";
//		String reverseWords="";
		String[] split = words.split("\\.");	
		
		for (int i = split.length-1; i >=0 ; i--) {
			System.out.print(split[i]+".");
		}		
		
//		for (int i = 0; i < split.length; i++) {
//			
//			String word=split[i];
//			
//			for (int j = word.length()-1;j>=0;j--) {
//				//  java
//				reverseWords+=word.charAt(j);
//			}
//			reverseWords+=" ";
//		}
//		
//		System.out.print(reverseWords);
	}
}
