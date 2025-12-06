package in.string;

class CountVowelsAndConsonants {
	public static void main(String[] args) {
		String name = "aebc"; //
		int vowel = 0, consonant = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if ("aeiou".indexOf(ch) != -1) {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("vowel : " + vowel);
		System.out.println("consonant : " + consonant);		
		System.out.println("aeiou".indexOf("c"));
	}
}