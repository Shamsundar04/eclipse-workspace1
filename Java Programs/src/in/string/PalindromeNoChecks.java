package in.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNoChecks {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int len=s.length();
		
		for(int i=0;i<len/2;i++) {
//			madam
//			01234	a		     	 a
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				System.out.println("not palindrome");
				System.exit(i);
			}			
		}
		System.out.println("palindrome");
		
		
		
//		String name = br.readLine();
////		System.out.println(name);
//		StringBuilder str=new StringBuilder(name);
//		StringBuilder reverse = str.reverse();
//		System.out.println(reverse);
		
		// madam
//		String reversed = "";
//
//		for (int i = name.length()-1; i >= 0; i--) {
//			reversed = reversed + name.charAt(i);
//		}
//		System.out.println(reversed);
//		System.out.println((name.equals(reversed)) ? "Palindrome" : "Not-Palindrome");

//		int num = Integer.parseInt(br.readLine());
//
//		int original = num;
//		int reversed = 0;
//
//		while (original != 0) {
//			int remender = original % 10;
//			reversed = reversed * 10 + remender;
//			original = original / 10;
//		}
//		System.out.println((reversed == num) ? "palindrome no" : "not palindrome no");
	}

}
