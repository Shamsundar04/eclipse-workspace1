package in.string;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LogestStringInArray {
	
	public static String longest(List<String> arr) {
		
		String longest=arr.get(0);
		
		for (int i = 0; i < arr.size(); i++) {
			
			if (arr.get(i).length()>longest.length()) {
				longest=arr.get(i);
			}
		}
		
		return longest;
    }
	
	public static void main(String[] args) {
//		Given an array arr[] containing strings of names. Your task is to return the longest string. 
//		If there are multiple names of the longest size, return the first occurring name.
//		
//		Examples :
//			Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
//			Output: "GeeksforGeeks"
//			Explanation: name "GeeksforGeeks" has maximum length among all names.
		

//		String arr[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
//
//		String max = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			
//			if (arr[i].length()>max.length()) {	
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
		
//		ArrayList<String> arr=new ArrayList<>();
//		arr.add("Geek");
		
		 ArrayList<String> names = new ArrayList<>(Arrays.asList(
		            "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"
		        ));
		 
		 System.out.println(longest(names));
	}
}
