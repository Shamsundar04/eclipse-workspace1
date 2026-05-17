package in.string;

public class PalindromeLongest {

	public static void main(String[] args) {
		
		String str = "babad";
		String longest = "";

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				String sub = str.substring(i, j);
				
				System.out.println(sub);
				
//				System.out.println(sub);
//				if (isPalindrome(sub) && sub.length() > longest.length()) {
//					longest = sub;
//				}
			}
		}

		System.out.println(longest);
	}

	public static boolean isPalindrome(String palindrome) {

		for (int i = 0; i < palindrome.length(); i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}