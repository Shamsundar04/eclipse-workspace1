package in.string;

import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {
		
//		String str="aaabbcc";
		
		String string="java";
		string=string.concat(" is language");
		System.out.println(string);
		
		String str="java is the java programming java";
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for(String c: str.split(" ")) {			
			map.put(c, map.getOrDefault(c, 0)+1);
//			System.out.println(map);
		}
		
		map.forEach((k,b)->System.out.println(k+" -> "+b));
		
//		System.out.println(map);
	}
}