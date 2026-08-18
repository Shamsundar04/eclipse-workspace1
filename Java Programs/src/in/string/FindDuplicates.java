package in.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicates {

	public static void main(String[] args) {
		
		
		String str="programming";
		
		for(char ch : str.toCharArray()) {
			
			if (str.indexOf(ch)!=str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println(map);
		
		
		
		int arr[] = {10,20,30,40,50,50,50};

		int first=0;
		int second=0;
		
		for (int num : arr) {
			
			if (num>first) {
				second=first;
				first=num;
			}else if (num>second) {
				second=num;
			}
		}
		
		
		System.out.println(second);
		
		
		
		
		
		IntStream distinct = Arrays.stream(arr).distinct();
		
		
		
		
		
		
	}
}
