package in.hashmap;

import java.util.HashMap;

public class CountFrequencyEachElement {
	public static void main(String[] args) {
		
		  int[] arr = {1, 2, 4, 2, 3, 3};
		  
		  HashMap<Integer, Integer> frequency=new HashMap<>();
		  
		  for (int i : arr) {
			
			  frequency.put(i, frequency.getOrDefault(i, 0)+1);
		}
		  
		  
		frequency.forEach((k, v)->System.out.println(k+" : "+v));
	}
}
