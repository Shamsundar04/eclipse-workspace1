package com.sham.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapMcq {
	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		map.put("Ravi", "Ampt");
//		map.put(new String("Ravi"), "Hyd");
//
//		System.out.println(map);

//		HashMap checks keys using .equals(), not ==.

//        Integer i1 = 128;
//		Integer i2 = 128;		
//		System.out.println(i1==i2);
//		System.out.println(i1.equals(i2));

//		Java creates two separate instances, so:
//		i1 == i2 → false (different objects)

//		Map<Integer, String> map = new HashMap<>();
//		map.put(128, "Ampt");
//		map.put(new Integer(128), "Hyd");
//		System.out.println(map.size());

		
		
//		HashMap hash = new HashMap<>();
//		hash.put("nit", 500);
//		hash.put("info", 644);
//		hash.put("tech", "google");
//		System.out.println(hash.get("tech"));
//		System.out.println(hash.get("google"));
//		System.out.println(hash.getOrDefault("nit", "Technology"));
//		System.out.println(hash.get("info"));
		
//		if the key is not available then it return the null
		
		
		
		
//		Map<String, Integer> map = new HashMap<>();
//		map.put("apple", 1);
//		map.put("banana", 2);
//		map.put("orange", 3);
//
//		map.replaceAll((k, v) -> v * 2);
//
//		System.out.println(map);
		
		
		
		
//		HashMap participant = new HashMap();
//		participant.put(1 + 1, "Dhoni");  // 1+1 = 2
//		participant.put(1 + 1, "Kohli");  // 1+1 = 2, replaces "Dhoni"
//		participant.put(2 + 1, "Rohit");  // 2+1 = 3
//
//		
//		Set set = participant.entrySet();
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//		    Map.Entry m = (Entry) itr.next();
//		    System.out.print(m.getKey() + " " + m.getValue() + " ");
//		}
		
		
		
//		Map<String, List<String>> map = new HashMap<>();
//        map.computeIfAbsent("items", k -> null).add("value");
		
		
//		Map<Integer, List<String>> map = new HashMap<>();
//        String[] words = {"hi", "yes", "no", "tree"};
//        for (String word : words) {
//            map.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
//        }
//        System.out.println(map.get(2));
		
		
		

//        Map<Integer, List<String>> map = new HashMap<>();
//        String[] words = {"cat", "dog", "bird", "fish", "ant"};
//        for (String word : words) {
//            int len = word.length();
//            map.computeIfAbsent(len, k -> new ArrayList<>()).add(word);
//        }
//        System.out.println(map);
		
		
		
		Map<Character, List<String>> map = new HashMap<>();
		String[] cities = { "Hyderabad", "Ajmer", "Haryana", "Ahmedabad", "Haridwar" };
		for (String city : cities) {
			char firstChar = city.charAt(0);
			map.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(city);
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
