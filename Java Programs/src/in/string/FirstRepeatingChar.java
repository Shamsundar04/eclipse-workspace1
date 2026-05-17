package in.string;

public class FirstRepeatingChar {
    
    static char firstRep(String str) {
       // your code here
      
       for(int i=0;i<str.length();i++) {
    	   for(int j=i+1;j<str.length();j++) {
    		   if(str.charAt(i)==str.charAt(j))
    			   return str.charAt(j);
    	   }
       }
       
       return '#';
   }
   
   public static void main(String[] args) {
     String str ="geeksforgeeks";
     
     for(int i=0;i<str.length();i++) {
    	 
    	 if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
			System.out.println(str.charAt(i));
			break;
		}
    	 
     }
     
     System.out.println(firstRep(str));
   }
}