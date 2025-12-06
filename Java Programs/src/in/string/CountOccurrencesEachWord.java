package in.string;

import java.util.HashMap;

public class CountOccurrencesEachWord {
	public static void main(String[] args) {
		String words = "Test Automation Java Automation Automation Automation";
		String[] split = words.split(" ");

//        for (int i = 0; i < split.length; i++) {
//            int count = 1; // word appears at least once
//
//            for (int j = i + 1; j < split.length; j++) {
//                if (split[i].equals(split[j])) {
//                    count++;
//                    split[j] = "0"; // mark as visited
//                }
//            }
//
//            if (!split[i].equals("0")) {
//                System.out.println(split[i] + " : " + count);
//            }
//        }

		HashMap<String, Integer> map = new HashMap<>();
		for (String word : split) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1); // test 1 automation 1
			}
		}

		map.entrySet().iterator()
				.forEachRemaining((entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}
