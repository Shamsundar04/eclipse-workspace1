package in.hashmap;

import java.util.HashMap;

public class NonRepeatingChar {
	public static void main(String[] args) {
//		Input : "swiss"
//		Output: 'w'
		
		String str="swiss";
		
		char[] charArray = str.toCharArray();
		
		HashMap<Character, Integer> word=new HashMap<>();
	
		for (char c : charArray) {
			
			word.put(c, word.getOrDefault(c, 0)+1);
			
		}
		
		
	}
}
