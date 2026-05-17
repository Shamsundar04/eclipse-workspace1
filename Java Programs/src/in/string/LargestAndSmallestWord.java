package in.string;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		String str = "Java is very powerful language";
		
		String[] split = str.split(" ");
		
		String max="";
		String min="";
		
		
		for (String string : split) {
			
			if (max.length()<=string.length()) {
				max=string;
			}			
			
			if (min.length()>string.length()) {
				min=string;
			}
		}
		
		System.out.println(min+" "+max);
		
	}

}
