package in.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FrequencySort {
    public static void main(String[] args) {

        String s = "tttree";
        
        Map<Character, Integer> map =new HashMap<>();
        
        for(char c : s.toCharArray()) {
        	map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        List<Character> list = new ArrayList<>(map.keySet());
//        list.sort((a,b)-> map.get(b) - map.get(a));
//        list.forEach(System.out::println);
        
        
        int freq[]=new int[256];
        
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){	
                System.out.print((char)i+""+freq[i]);
            }
        }
    }
}