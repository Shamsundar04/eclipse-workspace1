package in.string;

public class Occurrences {
	public static void main(String[] args) {
        String str = "apple";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == i) { // print only first occurrence
                long count = str.chars().filter(c -> c == ch).count();
                System.out.println(ch + " : " + count);
            }
        }
    }
}