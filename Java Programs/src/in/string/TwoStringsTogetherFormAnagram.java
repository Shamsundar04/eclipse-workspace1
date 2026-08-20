package in.string;

import java.util.Arrays;

public class TwoStringsTogetherFormAnagram {
	public static void main(String[] args) {
		
		String s1 = "Dirty";
		String s2 = "Room";
		String target = "dormitory";
		
		
		String combined=s1+s2;
		 combined = combined.toLowerCase();
		 
		 
		 char[] ch1 = combined.toCharArray();
		 char[] ch2 = target.toCharArray();
		 
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 
		 if (Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Non-Anagram");
		}
	}
}