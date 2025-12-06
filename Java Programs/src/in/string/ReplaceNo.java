package in.string;

public class ReplaceNo {
	
	public static void main(String[] args) {
		
		int no=1001;
		
		String replace = String.valueOf(no).replace('0', '5');
		int int1 = Integer.parseInt(replace);
		System.out.println(int1);
	}
}
