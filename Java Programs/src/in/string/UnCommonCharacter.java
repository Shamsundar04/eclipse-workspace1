package in.string;


import java.util.LinkedHashSet;
import java.util.Set;

public class UnCommonCharacter {
	public static void main(String[] args) {
	
		String s1 = "geeksforgeeks";
		String s2 = "geeksquiz";
		
	
//		s2.chars().mapToObj(c->(char)c).filter(ch->!s1.contains(ch.toString()))
//	    .collect(Collectors.toSet()).forEach(System.out::print);
//	   
//		s1.chars().mapToObj(c->(char)c).filter(ch->!s2.contains(ch.toString()))
//		.collect(Collectors.toSet()).forEach(System.out::print);
			
			    

		Set<String> restult=new LinkedHashSet<>();
		
		for (char ch : s1.toCharArray()) {
			if (!s2.contains(String.valueOf(ch))) {
				restult.add(String.valueOf(ch));
			}
		}
		
		for (char ch : s2.toCharArray()) {
			
			if (!s1.contains(String.valueOf(ch))) {
				restult.add(String.valueOf(ch));
			}
		}
		
		restult.forEach(System.out::print);
	}
}
