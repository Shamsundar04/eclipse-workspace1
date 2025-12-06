package in.string;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
//		Anagram means two words (or strings) that have:
//			Same characters
//			Same frequency of each character
//			But possibly in a different order
		
		String str1="listeN";
		String str2="silenT";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if (str1.length()!=str2.length()) {
			System.out.println("Not Anagram");
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}
	}
}
