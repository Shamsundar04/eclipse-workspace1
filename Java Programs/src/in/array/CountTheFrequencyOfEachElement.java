package in.array;

import java.util.HashMap;

public class CountTheFrequencyOfEachElement {

	public static void main(String[] args) {
		
		int a[]={1, 2, 2, 3, 3, 3, 4};
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		
		for (int i : a) {
			
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		
		System.out.println(map);
		
	}
}
