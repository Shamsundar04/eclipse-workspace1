package in.string;

public class Count {

	public static void main(String[] args) {
		
		String name="My name is sham";
		
	       String[]word=name.split(" ");
		
	       for(String words:word)
	       {
	    	   System.out.println(words+"="+words.length());
	       }

	}

}
