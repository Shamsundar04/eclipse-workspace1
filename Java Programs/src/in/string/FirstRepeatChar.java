package in.string;

import java.util.HashSet;

public class FirstRepeatChar {

	public static Character firstRepeatChar(String name) {

		HashSet<Character> set = new HashSet<>();

		for (char ch : name.toCharArray()) { // geeks

			if (set.contains(ch)) {
				return ch;
			}
			
			set.add(ch);   //ge
		}
		return null;
	}

	public static void main(String[] args) {

		String name = "geks";

//		FirstRepeatChar obj = new FirstRepeatChar();
		Character result = FirstRepeatChar.firstRepeatChar(name);
		
		if (result != null) {
			System.out.println("first repeate character : "+result);
		}
		else {
			System.out.println("not repeate character");
		}
		

	}
}
