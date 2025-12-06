package in.string;

public class ReverseString {

	public static void main(String[] args) {

		String word = "Hello";
		
//		String reverse="";
//		
//		for (int i = word.length()-1; i >= 0; i--) {
//			reverse+=word.charAt(i);
//		}
//
//		System.out.println(reverse);

		String word1 = new StringBuilder(word).reverse().toString();
		System.out.println(word1);
	}
}
