package in.string;

public class CheckOneStringContainsAnother {

	 public static boolean checkShift(String s1, String s2) {

	        for(int i=0;i<s1.length();i++){

	            s1 = s1.charAt(s1.length()-1) + s1.substring(0,s1.length()-1);

	            if (s1.equals(s2)) {
					return true;
				}
	        }
	        
	        return false;
	    }

	    public static void main(String[] args) {

	        String s1="abcd";
	        String s2="cdab";

	        System.out.println(checkShift(s1,s2));
	    }
}