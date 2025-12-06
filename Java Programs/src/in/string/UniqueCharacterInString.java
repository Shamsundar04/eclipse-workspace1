package in.string;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		
		String name = "ababcdabcd";
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }

        System.out.println(result); // Output: abcd

	}

}
