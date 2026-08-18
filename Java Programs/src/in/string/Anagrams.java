package in.string;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
//		Anagram means two words (or strings) that have:
//			Same characters
//			Same frequency
//			But in a different order
		
		String str1="listeN";
		String str2="silenT";
		
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (str1.length()!=str2.length()) {
			System.out.println("Not anagram");
		}
	
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}
	}
}
