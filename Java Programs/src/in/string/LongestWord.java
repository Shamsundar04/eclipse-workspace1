package in.string;

public class LongestWord {
    public static void main(String[] args) {

        String str = "Java is object oriented programming";

        String[] split = str.split(" ");

        String max = split[0];

        for (int i = 1; i < split.length; i++) {
            if (split[i].length() > max.length()) {
                max = split[i];
            }
        }

        System.out.println(max);
    }
}
