package in.string;

public class FirstRepeatingChar {
    
    static char firstRep(String S) {
       // your code here
      
       for(int i=0;i<S.length();i++){
           
           for(int j=i+1;j<S.length();j++){
               
               if(S.charAt(i)==S.charAt(j)){
                    return S.charAt(j);
               }
           }
       }
       
       return '#';
   }
   
   public static void main(String[] args) {
     String S ="geeksforgeeks";
     
     System.out.println(firstRep(S));
   }
}