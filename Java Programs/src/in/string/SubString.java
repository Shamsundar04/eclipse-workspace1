package in.string;

class SubString {
    public static void main(String[] args) {
        // String name="sham1234";
        // String pattern="*".repeat(name.length()-4)+name.substring(4);
        // System.out.println(pattern);
        
        // StringBuilder builder=new StringBuilder(name.substring(0,5));
        // System.out.println(builder.reverse()+name.substring(5));
    
        // Input: "ABCDEFGH" → Output: "EFGHABCD"
        // String name="ABCDEFGH";
        // System.out.println(name.substring(4)+name.substring(0,4));
  
        // Input: "sham123@gmail.com" → Output: "sham123"
        // String name="sham123@gmail.com";
        // System.out.println(name.substring(0,7));
    
        // Input: "sham123@gmail.com" → Output: "gmail"
        String name="sham123@gmail.com";
        System.out.println(name.substring(8,13));
        
    }
}