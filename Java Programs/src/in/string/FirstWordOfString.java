package in.string;

public class FirstWordOfString {

	public static void main(String[] args) {

		String str="World Health Organization";
		
		String[] word=str.split(" ");

		for (String string : word) {
			System.out.print(string.charAt(0));
		}
		
//		String[] split = str.split(" ");
//		System.out.println(split[0].charAt(0)+""+split[1].charAt(0)+""+split[2].charAt(0));
//		System.out.println(split[0]+" : "+split[0].length());
		
		
		
	}
}
