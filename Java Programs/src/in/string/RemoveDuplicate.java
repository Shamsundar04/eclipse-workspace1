package in.string;

import java.util.HashSet;

public class RemoveDuplicate {
	
	HashSet<Character> set=new HashSet<>();
	
	public String removeDulplicate(String name) {
		
		for (char ch : name.toCharArray()) {
			if (set.contains(ch)) {
				set.remove(ch);
			}
			
			set.add(ch);
			
		}
		System.out.println(set);
		return null;
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicate obj=new RemoveDuplicate();
		String result = obj.removeDulplicate("rraamm");
		System.out.println(result);
	}
}